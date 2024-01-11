import sys
from collections import Counter

input = sys.stdin.readline

N = int(input())
cards = list(map(int,input().split()))
M = int(input())
nums = list(map(int,input().split()))

c = Counter(cards)

for i in nums:
    if i in c:
        print(c[i], end= ' ')
    else:
        print(0, end=' ')