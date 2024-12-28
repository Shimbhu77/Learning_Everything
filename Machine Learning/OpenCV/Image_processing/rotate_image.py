import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\emma_watson.webp"

img = cv2.imread(image_path)

re_size_image = cv2.resize(img,(400,500))

# Rotating
rows, cols = re_size_image.shape[:2]
M = cv2.getRotationMatrix2D((cols/2, rows/2), 90, 1)
rotated = cv2.warpAffine(re_size_image, M, (cols, rows))

cv2.imshow("shimbhu ", rotated)

cv2.waitKey(0)

cv2.destroyAllWindows()

