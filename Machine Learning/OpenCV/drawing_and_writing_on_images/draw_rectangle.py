import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\sanjna_sanghi.jpg"

img = cv2.imread(image_path)

re_size_image = cv2.resize(img, (500, 700))

new_img = cv2.rectangle(img=re_size_image, pt1=(170, 100), pt2=(370, 330), color=(0, 255, 0), thickness=4, lineType=16)

# thickness = -1 will cover the rectangle with given color and fill the color inside the rectangle
# new_img = cv2.rectangle(img=re_size_image, pt1=(170, 100), pt2=(370, 330), color=(0, 255, 0), thickness=-1, lineType=16)

cv2.imshow("Shimbhu", new_img)

cv2.waitKey(0)

cv2.destroyAllWindows()
