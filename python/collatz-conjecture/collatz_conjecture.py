def is_even(number):
    return number % 2 == 0


def steps(number):
    if number < 1:
        raise ValueError("Only positive integers are allowed")

    steps = 0
    while number > 1:
        number = number / 2 if is_even(number) else 3 * number + 1
        steps += 1
    return steps
