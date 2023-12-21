plate = list(input())

sum = 0
for i in range(1,len(plate)):
    if plate[i] == plate[i-1]:
        if i == 1:
            sum += 15
        else:
            sum += 5
    else:
        if i == 1:
            sum += 20
        else:
            sum += 10
print(sum)