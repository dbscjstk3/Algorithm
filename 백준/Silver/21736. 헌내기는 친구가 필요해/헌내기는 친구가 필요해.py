import sys
from collections import deque
input = sys.stdin.readline
dx = [-1,1,0,0]
dy = [0,0,-1,1]

def bfs(start):
    queue = deque([start])
    visited = [[False] * m for _ in range(n)]
    visited[start[0]][start[1]] = True
    count = 0

    while queue:
        x, y = queue.popleft()
        for d in range(4):
            nx, ny = x + dx[d], y + dy[d]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if visited[nx][ny]:
                continue
            if campus[nx][ny] == 'X':
                continue
            if campus[nx][ny] == 'P':
                count += 1
            visited[nx][ny] = True
            queue.append((nx,ny))
    return count

n, m = map(int, input().split())
campus = []
for i in range(n):
    line = input().strip()
    if 'I' in line :
        start = (i, line.index('I'))
    campus.append(line)

answer = bfs(start)

print('TT' if answer == 0 else answer)
        