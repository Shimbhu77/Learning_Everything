import calc
import stringop

# from calc import sum
from stringop import string_length


sum =  calc.sum(10,12)

print(sum)

# def test_sum():

name = "hello"

print(stringop.reverse_string(name))

word = "madam"
print(stringop.is_palindrome(word))

print(string_length("Shimbhu"))

import math

print(math.factorial(5))

import datetime

today = datetime.date.today()
now = datetime.datetime.now()
print(today)
print(now)

import random

print(random.randint(1, 10))

print(random.uniform(1, 10))

print(random.choice(["apple", "banana", "cherry"]))


