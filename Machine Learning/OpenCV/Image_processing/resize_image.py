import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\emma_watson.webp"

img = cv2.imread(image_path)

# resize the image

re_size_image = cv2.resize(img,(400,500))

cv2.imshow("shimbhu ", re_size_image)

cv2.waitKey(0)

cv2.destroyAllWindows()

