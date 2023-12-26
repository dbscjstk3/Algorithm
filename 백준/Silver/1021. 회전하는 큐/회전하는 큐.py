from collections import deque
import sys

N,M = map(int,input().split())
arr = list(map(int,sys.stdin.readline().split()))
dq = deque([i for i in range(1,N+1)])
cnt = 0

for i in arr:
    while True:
        if dq[0] == i:
            dq.popleft()
            break
        else:
            if dq.index(i) <= len(dq) // 2:
                dq.rotate(-1)
                cnt += 1
            else:
                dq.rotate(1)
                cnt += 1
print(cnt)