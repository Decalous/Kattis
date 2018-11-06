

width = input()
pieces = input()
area = 0
for piece in range(pieces):
    side1, side2 = raw_input().split()
    area += int(side1) * int(side2)
print area / width
