N, M = map(int,input().split())
cards = list(map(int,input().split()))
sums = []

for i in range(len(cards)):
    for j in range(i+1,len(cards)):
        for k in range(j+1,len(cards)):
            sum = cards[i]+cards[j]+cards[k]
            if sum <= M:
                sums.append(sum)

print(max(sums))
