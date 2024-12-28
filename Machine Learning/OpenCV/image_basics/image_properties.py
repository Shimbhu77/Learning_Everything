import cv2

image_path = r"C:\Users\kumaw\Desktop\Learning Everything\Learning_Everything\Machine Learning\OpenCV\images\keerthy_suresh.jpg"

img = cv2.imread(image_path)

# resize the image

img = cv2.resize(img,(300,500))

# Display image properties

print(f" Image shape : {img.shape}")
print(f" Image size : {img.size}")
print(f" Image data type : {img.dtype}")

print(img)


# getting pixel and modify it's values

pixel = img[100,100]

print(f" pixel values at (100,100) : {pixel}")


# modify the pixel
img[100,100] = [255,0,0]   # Set to blue in BGR

# Split the image into color channels
b,g,r = cv2.split(img)

# convert to grey scale
gray = cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)

# convert to HSV

hsv = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)

# Display images

cv2.imshow("Original image",img)
cv2.imshow("Blue image",b)
cv2.imshow("Red image",g)
cv2.imshow("Green image",r)
cv2.imshow("Gray image",gray)
cv2.imshow("HSV image",hsv)


# saving an image

cv2.imwrite("gray_image.jpg",gray)

cv2.waitKey(0)

cv2.destroyAllWindows()




