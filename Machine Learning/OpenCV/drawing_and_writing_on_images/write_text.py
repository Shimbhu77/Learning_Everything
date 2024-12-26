import cv2
import numpy as np

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\sanjna_sanghi.jpg"

img = cv2.imread(image_path)

re_size_image = cv2.resize(img, (500, 700))

pts = np.array([[170, 100], [270, 50], [370, 110], [350, 330], [180, 320]])

new_img = cv2.polylines(img=re_size_image, pts=[pts], isClosed=True, color=(0, 255, 0), thickness=4, lineType=16)

# thickness = -1 will cover the polygon with given color and fill the color inside the polygon

cv2.imshow("Shimbhu", new_img)

cv2.waitKey(0)

cv2.destroyAllWindows()
