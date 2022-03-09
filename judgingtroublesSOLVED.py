import sys

counts1, counts2 = {}, {}
matches = 0
numlines = int(sys.stdin.readline())
for i in range(numlines):
    result = sys.stdin.readline()
    if (result in counts1):
        counts1[result] += 1
    else:
        counts1[result] = 1
for i in range(numlines):
    result = sys.stdin.readline()
    if (result in counts2):
        counts2[result] += 1
    else:
        counts2[result] = 1
for k, v in counts1.items(): #https://docs.python.org/3/tutorial/datastructures.html
    if k in counts2:
        # if the key exists in both, take the lower number to get the number of matches for that key
        if v > counts2[k]:
            matches += counts2[k] 
        else:
            matches += v
print(matches)