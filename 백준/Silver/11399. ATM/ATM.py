import sys

input = sys.stdin.readline

n = int(input())

p = list(map(int, input().split()))

p.sort()

total = 0
sum = 0
for i in p:
    sum += i
    total += sum

print(total)