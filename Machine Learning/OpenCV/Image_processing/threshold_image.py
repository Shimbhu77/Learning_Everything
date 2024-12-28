import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\emma_watson.webp"

img = cv2.imread(image_path)

# resize the image

img = cv2.resize(img,(600,700))

# Create a rectangle
rectangle = np.zeros(img.shape[:2], dtype='uint8')
cv2.rectangle(rectangle, (25, 25), (275, 175), 255, -1)

# Bitwise operations
bitwise_and = cv2.bitwise_and(img, img, mask=rectangle)

# Thresholding
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
_, thresh = cv2.threshold(gray, 127, 255, cv2.THRESH_BINARY)

cv2.imshow("shimbhu ", thresh)

cv2.waitKey(0)

cv2.destroyAllWindows()

