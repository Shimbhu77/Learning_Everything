from flask import Flask, request, jsonify
from werkzeug.utils import secure_filename
import whisper
import torch
import logging
import os
from pathlib import Path
import warnings
from datetime import datetime

# Configure logging
logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s - %(levelname)s - %(message)s'
)
logger = logging.getLogger(__name__)

# Initialize Flask app
app = Flask(__name__)

# Configuration
app.config['MAX_CONTENT_LENGTH'] = 16 * 1024 * 1024  # 16MB max file size
app.config['UPLOAD_FOLDER'] = 'audio_uploads'
app.config['ALLOWED_EXTENSIONS'] = {'wav', 'mp3', 'ogg', 'm4a'}

# Create upload folder if it doesn't exist
Path(app.config['UPLOAD_FOLDER']).mkdir(parents=True, exist_ok=True)


# Initialize Whisper model globally
def initialize_model(model_size="base"):
    warnings.filterwarnings("ignore", category=FutureWarning)
    device = "cuda" if torch.cuda.is_available() else "cpu"

    if device == "cpu":
        model = whisper.load_model(model_size).float()
    else:
        model = whisper.load_model(model_size)

    model = model.to(device)
    logger.info(f"Model initialized on {device}")
    return model, device


MODEL, DEVICE = initialize_model()


def allowed_file(filename):
    return '.' in filename and \
        filename.rsplit('.', 1)[1].lower() in app.config['ALLOWED_EXTENSIONS']


@app.route('/health', methods=['GET'])
def health_check():
    return jsonify({
        'status': 'healthy',
        'device': DEVICE,
        'timestamp': datetime.now().isoformat()
    })


@app.route('/api/transcribe', methods=['POST'])
def transcribe_audio():
    # Check if file was included in request
    if 'file' not in request.files:
        return jsonify({
            'error': 'No file provided'
        }), 400

    file = request.files['file']

    # Check if file was selected
    if file.filename == '':
        return jsonify({
            'error': 'No file selected'
        }), 400

    # Check file type
    if not allowed_file(file.filename):
        return jsonify({
            'error': f'File type not allowed. Allowed types: {", ".join(app.config["ALLOWED_EXTENSIONS"])}'
        }), 400

    try:
        # Save file
        filename = secure_filename(file.filename)
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        safe_filename = f"{timestamp}_{filename}"
        filepath = os.path.join(app.config['UPLOAD_FOLDER'], safe_filename)
        file.save(filepath)

        logger.info(f"Processing file: {safe_filename}")

        # Transcribe
        transcribe_options = {
            "fp16": False if DEVICE == "cpu" else True
        }

        result = MODEL.transcribe(filepath, **transcribe_options)

        # Clean up
        os.remove(filepath)

        return jsonify({
            'status': 'success',
            'transcript': result["text"],
            'language': result.get("language", "unknown"),
            'segments': result.get("segments", []),
        })

    except Exception as e:
        logger.error(f"Error processing file: {str(e)}")
        # Clean up in case of error
        if os.path.exists(filepath):
            os.remove(filepath)
        return jsonify({
            'error': 'Error processing audio file',
            'details': str(e)
        }), 500


@app.errorhandler(413)
def request_entity_too_large(error):
    return jsonify({
        'error': 'File too large',
        'max_size': '16MB'
    }), 413


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)