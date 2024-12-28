import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\dhvani-bhanushali.webp"

img = cv2.imread(image_path)

# resize the image

re_size_image = cv2.resize(img,(600,500))

# Image arithmetic
brightened = cv2.add(re_size_image, np.ones(re_size_image.shape, dtype='uint8') * 50)
darkened = cv2.subtract(re_size_image, np.ones(re_size_image.shape, dtype='uint8') * 50)

cv2.imshow("brightened ", brightened)
cv2.imshow("darkened ", brightened)

cv2.waitKey(0)

cv2.destroyAllWindows()

