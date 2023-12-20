boil = int(input())
kpa = boil*5 - 400
print(kpa)
if kpa == 100:
    print(0)
elif kpa < 100:
    print(1)
else:
    print(-1)