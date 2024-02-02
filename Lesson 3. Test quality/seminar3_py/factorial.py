import unittest

# test_factorial.py

from my_math import factorial

class TestFactorial(unittest.TestCase):
    def test_factorial_of_0(self):
        result = factorial(0)
        self.assertEqual(result, 1)

    def test_factorial_of_1(self):
        result = factorial(1)
        self.assertEqual(result, 1)

    def test_factorial_of_5(self):
        result = factorial(5)
        self.assertEqual(result, 120)

if __name__ == '__main__':
    unittest.main()

