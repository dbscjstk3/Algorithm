import sys

n = int(input())

arr = list(map(int,sys.stdin.readline().split()))
v = int(input())

print(arr.count(v))
