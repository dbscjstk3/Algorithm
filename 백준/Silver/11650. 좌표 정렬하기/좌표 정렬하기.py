import sys

XY = []
for _ in range(int(sys.stdin.readline())):
    x, y = map(int,sys.stdin.readline().split())
    XY.append([x,y])

XY.sort()
for i in XY:
    print(i[0],i[1])