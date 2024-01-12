n = int(input())

data = []
score = []

for _ in range(n):
    weight, height = map(int,input().split())
    data.append((weight,height))

for i in range(n):
    count = 0
    for j in range(n):
        if data[i][0] < data[j][0] and data[i][1] < data[j][1]:
            count += 1
    score.append(count + 1)

for x in score:
    print(x,end=' ')