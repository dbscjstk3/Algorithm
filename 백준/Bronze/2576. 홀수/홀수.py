odd = []
for _ in range(7):
    num = int(input())
    if num % 2 == 1:
        odd.append(num)

odd.sort()
if len(odd):
    print(sum(odd))
    print(odd[0])
else:
    print(-1)
