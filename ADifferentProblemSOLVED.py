import sys

flag = True
a, b = sys.stdin.readline().split()
while flag:
    print(int(abs(float(a) - float(b))))
    try:
        a, b = sys.stdin.readline().split()
    except:
        flag = False