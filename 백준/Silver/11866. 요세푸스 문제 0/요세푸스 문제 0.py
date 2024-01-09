from collections import deque

answer = []

N, K = map(int,input().split())
queue = deque([i for i in range(1,N+1)])

while queue:
    for i in range(K-1):
        queue.append(queue.popleft())
    answer.append(queue.popleft())

print("<",end ='')
for i in range(len(answer)-1):
    print("%d, "%answer[i],end='')
print(answer[-1],end='')
print(">",end='')