import whisper
import torch
import sounddevice as sd
import soundfile as sf
import numpy as np
from pathlib import Path
import warnings
import logging

# Configure logging
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)


def record_audio(duration=5, sample_rate=16000):
    """
    Record audio from microphone

    Args:
        duration (int): Recording duration in seconds
        sample_rate (int): Sample rate in Hz

    Returns:
        numpy.ndarray: Recorded audio data
    """
    logger.info(f"Recording for {duration} seconds...")
    audio_data = sd.rec(int(duration * sample_rate),
                        samplerate=sample_rate,
                        channels=1)
    sd.wait()
    logger.info("Recording finished")
    return audio_data


def save_audio(audio_data, filename="recorded_audio.wav", sample_rate=16000):
    """
    Save audio data to file

    Args:
        audio_data (numpy.ndarray): Audio data to save
        filename (str): Output filename
        sample_rate (int): Sample rate in Hz
    """
    sf.write(filename, audio_data, sample_rate)


def transcribe_audio(audio_path, model_size="base"):
    """
    Transcribe audio file using Whisper

    Args:
        audio_path (str): Path to audio file
        model_size (str): Whisper model size ('tiny', 'base', 'small', 'medium', 'large')

    Returns:
        str: Transcribed text
    """
    # Suppress the FutureWarning about torch.load
    warnings.filterwarnings("ignore", category=FutureWarning)

    # Check if CUDA is available
    device = "cuda" if torch.cuda.is_available() else "cpu"

    # Load model with appropriate settings
    if device == "cpu":
        # Force FP32 on CPU
        model = whisper.load_model(model_size).float()
    else:
        model = whisper.load_model(model_size)

    model = model.to(device)

    # Log device and model information
    logger.info(f"Using device: {device}")
    logger.info(f"Model size: {model_size}")

    # Transcribe with appropriate settings
    transcribe_options = {
        "fp16": False if device == "cpu" else True  # Disable FP16 on CPU
    }

    try:
        result = model.transcribe(audio_path, **transcribe_options)
        return result["text"]
    except Exception as e:
        logger.error(f"Transcription failed: {str(e)}")
        raise


def main():
    # Create output directory if it doesn't exist
    output_dir = Path("audio_output")
    output_dir.mkdir(exist_ok=True)

    try:
        # Record audio
        audio_data = record_audio(duration=5)
        audio_path = output_dir / "recorded_audio.wav"
        save_audio(audio_data, str(audio_path))

        # Transcribe
        transcription = transcribe_audio(str(audio_path))
        print("\nTranscription:")
        print(transcription)

    except Exception as e:
        logger.error(f"An error occurred: {str(e)}")


if __name__ == "__main__":
    main()