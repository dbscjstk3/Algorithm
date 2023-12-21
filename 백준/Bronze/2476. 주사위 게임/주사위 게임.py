prizes = []
for _ in range(int(input())):
    dice = list(map(int,input().split()))
    for i in range(len(dice)):
        if dice.count(dice[i]) == 3:
            prizes.append(10000+dice[i]*1000)
        elif dice.count(dice[i]) == 2:
            prizes.append(1000+dice[i]*100)
        elif dice.count(dice[i]) == 1:
            prizes.append(max(dice)*100)

print(max(prizes))