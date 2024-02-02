def fibonacci(number: int) -> int:
    if number in (0, 1):
        return number
    return fibonacci(number - 1) + fibonacci(number - 2)