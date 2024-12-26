import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\emma_watson.webp"

img = cv2.imread(image_path)

# Create a rectangle
rectangle = np.zeros(img.shape[:2], dtype='uint8')
cv2.rectangle(rectangle, (25, 25), (275, 175), 255, -1)

# Bitwise operations
bitwise_and = cv2.bitwise_and(img, img, mask=rectangle)

cv2.imshow("shimbhu ", bitwise_and)

cv2.waitKey(0)

cv2.destroyAllWindows()

