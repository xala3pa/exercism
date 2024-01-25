def is_armstrong_number(number):
    return sum(int(n) ** len(str(number)) for n in str(number)) == number
