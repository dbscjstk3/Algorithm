import sys
input = sys.stdin.readline

n, k = map(int, input().split())

degrees = list(map(int, input().split()))

current_sum = sum(degrees[:k])
answer = current_sum

for i in range(k, n):
    current_sum += degrees[i]
    current_sum -= degrees[i-k]
    answer = max(answer, current_sum)


print(answer)
