import math


def is_prime(number: int) -> bool:
    if number < 2:
        return False
    if 1 < number < 4:
        return True
    for n in range(1, int(math.sqrt(number))):
        if not ((6 * n - 1) % number) or not ((6 * n + 1) % number):
            return True

    return False
