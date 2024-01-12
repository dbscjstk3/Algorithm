from collections import deque

T = int(input())
for _ in range(T):
    N, M = map(int,input().split())
    priority = deque(list(map(int,input().split())))
    idx = deque([i for i in range(N)])
    cnt = 0

    while priority:
        if priority[0] == max(priority):
            cnt += 1
            priority.popleft()
            if idx.popleft() == M:
                print(cnt)
                break
        else:
            priority.append(priority.popleft())
            idx.append(idx.popleft())