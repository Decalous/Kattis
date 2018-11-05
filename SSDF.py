import math

cases = input()
for case in range(cases):
    increment, base, num = raw_input().split()
    base = int(base)
    num = int(num)
    total = 0
    maxPow = math.log(num, base)
    maxPow = int(math.floor(maxPow))
    for power in range(maxPow, -1, -1):
        digit = num / (base ** power)
        total += digit * digit
        num -= digit * base ** power
    print increment + " " + str(total)


