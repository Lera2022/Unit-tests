from functools import reduce


def factorial(number: int) -> int:
    return reduce(lambda a, x: a * x, range(1, number + 1), 1)
