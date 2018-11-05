import math

stars = input()
print str(stars) + ":"
for length in range(2, int(math.ceil(float(stars)/2)) + 1):
    if (stars % (length + length - 1) == 0
        or stars % (length + length - 1) == length):
        print str(length) + "," + str(length - 1)
    if (stars % length == 0):
        print str(length) + "," + str(length)
    
