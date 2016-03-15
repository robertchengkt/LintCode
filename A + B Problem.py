def aplusb(a, b):
    # write your code here, try to do it without arithmetic operators.
    while (b != 0):
        carry = a & b
        a = a ^ b
        b = carry << 1
    return a

print aplusb (100, -10)