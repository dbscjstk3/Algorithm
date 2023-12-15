A = int(input())
B = int(input())
C = int(input())
sum = 0

ISBN = '9780921418' + str(A) + str(B) + str(C)

for i in range(len(ISBN)):
    if i % 2 == 0:
        sum  += int(ISBN[i]) * 1
    else:
        sum += int(ISBN[i]) * 3

print(f'The 1-3-sum is {sum}')