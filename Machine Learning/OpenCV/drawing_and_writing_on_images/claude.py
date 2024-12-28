import cv2
import numpy as np

# Create a blank image
img = np.zeros((500, 500, 3), dtype='uint8')

# Draw a line
cv2.line(img, (0, 0), (500, 500), (0, 255, 0), 3)

# Draw a rectangle
cv2.rectangle(img, (50, 50), (150, 150), (0, 0, 255), 2)

# Draw a filled rectangle
cv2.rectangle(img, (200, 200), (300, 300), (255, 0, 0), -1)

# Draw a circle
cv2.circle(img, (250, 250), 50, (0, 255, 255), 2)

# Draw a filled circle
cv2.circle(img, (400, 400), 50, (255, 255, 0), -1)

# Draw a polygon
pts = np.array([[10, 400], [120, 450], [220, 400], [120, 350]], np.int32)
pts = pts.reshape((-1, 1, 2))
cv2.polylines(img, [pts], True, (255, 0, 255), 2)

# Add text
font = cv2.FONT_HERSHEY_SIMPLEX
cv2.putText(img, 'OpenCV', (10, 30), font, 1, (255, 255, 255), 2, cv2.LINE_AA)

# Display the image
cv2.imshow('Drawing', img)
cv2.waitKey(0)
cv2.destroyAllWindows()