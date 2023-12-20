import sys
input = sys.stdin.readline
sum = 0
while True:
    i = int(input())
    if i == -1:
        break
    sum += i

print(sum)