
cases = input()
for case in range(cases):
    increment, days = raw_input().split()
    days = int(days)
    candles = (days/2) * (days + 1) + (days)
    if (days % 2 == 1):
        candles = (days/2) * (days + 1) + (days) + (days/2 + 1)
    print str(increment) + " " + str(candles)
