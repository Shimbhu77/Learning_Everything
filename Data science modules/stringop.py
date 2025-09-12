# string reverse

def reverse_string(s):
    """
    This function takes a string as input and returns the reversed string.
    """
    return s[::-1]

# string palindrome

def is_palindrome(s):
    """
    This function checks if the given string is a palindrome.
    """
    return s == s[::-1]

# contcatenate

def concatenate_strings(s1, s2):
    """
    This function concatenates two strings and returns the result.
    """
    return s1 + s2

# string length

def string_length(s):
    """
    This function returns the length of the given string.
    """
    return len(s)