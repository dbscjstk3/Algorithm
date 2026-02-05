import sys

input = sys.stdin.readline

n = int(input())

li = list(map(int, input().split()))

li2 = sorted(set(li))

dic = {}

for idx, value in enumerate(li2):
    dic[value] = idx

for value in li:
    print(dic[value], end=' ')