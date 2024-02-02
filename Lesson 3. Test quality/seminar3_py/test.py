# test_palindrome.py

import palindrome

def test_is_palindrome():
    assert palindrome.is_palindrome("racecar") == True
    assert palindrome.is_palindrome("A man, a plan, a canal, Panama") == True
    assert palindrome.is_palindrome("hello") == False


test_is_palindrome()