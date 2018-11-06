
mylist = []
n1, n2, n3 = raw_input().split()
mylist.append(int(n1))
mylist.append(int(n2))
mylist.append(int(n3))
mylist.sort()

diff1 = mylist[1] - mylist[0]
diff2 = mylist[2] - mylist[1]
if (diff1 == diff2):
    print mylist[2] + diff1
elif (diff2 > diff1):
    print mylist[1] + diff1
else:
    print mylist[0] + diff2
