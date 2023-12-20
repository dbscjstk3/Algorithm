N = int(input())
chicken = list(map(int,input().split()))
result = 0
for i in range(len(chicken)):
    if chicken[i] <= N:
        result += chicken[i]
    else:
        result += N
print(result)