def is_triangle(a, b, c):
    return a + b > c and a + c > b and b + c > a


def equilateral(sides):
    a, b, c = sides
    return is_triangle(a, b, c) and a == b == c == a


def isosceles(sides):
    a, b, c = sides
    return is_triangle(a, b, c) and (a == b or b == c or a == c)


def scalene(sides):
    a, b, c = sides
    return is_triangle(a, b, c) and a != b != c != a
