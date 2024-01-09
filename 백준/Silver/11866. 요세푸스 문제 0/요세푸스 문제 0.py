import sys

N, K = map(int,sys.stdin.readline().split())

queue = [i for i in range(1,N+1)]
answer = []
idx = 0
while queue:
    idx += K-1
    if idx >= len(queue):
        idx %= len(queue)
    answer.append(str(queue.pop(idx)))

print('<' + ', '.join(answer) + '>')