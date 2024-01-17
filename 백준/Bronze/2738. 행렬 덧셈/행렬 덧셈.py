N, M = map(int,input().split())
a = []
b = []

for _ in range(N):
    x = list(map(int,input().split()))
    a.append(x)

for _ in range(N):
    y = list(map(int,input().split()))
    b.append(y)

for i in range(N):
    for j in range(M):
        print(a[i][j] + b[i][j], end = ' ')
    print()