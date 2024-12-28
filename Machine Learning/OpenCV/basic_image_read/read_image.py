import cv2

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\keerthy_suresh.jpg"
image_path2 = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\emma_watson.webp"

image = cv2.imread(image_path2)

cv2.imshow("Shimbhu",image)

cv2.waitKey(3000)

cv2.destroyAllWindows()