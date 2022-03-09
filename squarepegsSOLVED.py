import sys
import math

count = 0
## num of n = circular plots, m = circular houses, k = square houses
n, m, k = sys.stdin.readline().split()
cplot, chouse, sqhouse = [], [], []
cplot = sys.stdin.readline().split()
## convert from str to int
for i in range(len(cplot)): 
    cplot[i] = int(cplot[i])

chouse = sys.stdin.readline().split()
for i in range(len(chouse)): 
    chouse[i] = int(chouse[i])

sqhouse = sys.stdin.readline().split()
for i in range(len(sqhouse)): 
    sqhouse[i] = int(sqhouse[i])
    
## convert sqhouses to chouses (side length to 'radius' of square)
newsqhouse = []
for i in range(len(sqhouse)):
    radius = math.sqrt(2 * int(sqhouse[i]) ** 2) / 2
    newsqhouse.append(radius)
house = chouse + newsqhouse

## try to find a plot for each house starting with largest houses 
house.sort(reverse = True)
cplot.sort(reverse = True)
for i in range(len(house)):
    for j in range(len(cplot)):
        if (house[i] < cplot[j]):
            count += 1
            del cplot[j]
            break

print(count)