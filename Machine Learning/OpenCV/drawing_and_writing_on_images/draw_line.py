import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\tom_cruise.webp"

img = cv2.imread(image_path)

re_size_image = cv2.resize(img,(500,700))

new_img = cv2.line(re_size_image,(160,130),(360,150),(0,255,0),4,16)

cv2.imshow("Shimbhu",new_img)

cv2.waitKey(0)

cv2.destroyAllWindows()