T = int(input())
cont = list(map(int,input().split()))
sum = 0
for i in cont:
    if i == T:
        sum += 1
print(sum)