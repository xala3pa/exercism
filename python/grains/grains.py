NUMBERS_OF_SQUARES = 64


def square(number):
    if number not in range(1, NUMBERS_OF_SQUARES + 1):
        raise ValueError("square must be between 1 and 64")

    return 2 ** (number - 1)


def total():
    return sum(square(n) for n in range(1, NUMBERS_OF_SQUARES + 1))
