plate = list(input())
sum = 0

for i in range(len(plate)):
    if i == 0:
        sum += 10
    elif plate[i] == plate[i-1]:
        sum += 5
    else:
        sum += 10
print(sum)