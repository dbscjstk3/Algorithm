import sys

XY = []
for _ in range(int(sys.stdin.readline())):
    x, y = sys.stdin.readline().split()
    XY.append((int(x),y))

XY.sort(key=lambda x:x[0])
for i in XY:
    print(i[0],i[1])