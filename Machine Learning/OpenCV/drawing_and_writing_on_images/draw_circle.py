import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\sanjna_sanghi.jpg"

img = cv2.imread(image_path)

re_size_image = cv2.resize(img, (500, 700))

new_img = cv2.circle(img=re_size_image, center=(280, 200), radius=140, color=(240, 240, 240), thickness=4, lineType=16)

# thickness = -1 will cover the rectangle with given color and fill the color inside the rectangle
# new_img = cv2.circle(img=re_size_image, center=(280, 200), radius=140, color=(240, 240, 240), thickness=-1, lineType=16)


cv2.imshow("Shimbhu", new_img)

cv2.waitKey(0)

cv2.destroyAllWindows()
