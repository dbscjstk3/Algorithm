n = int(input())
stack, sign, isValid = [], [], True
now = 1

for _ in range(n):
    num = int(input())
    while now <= num:
        stack.append(now)
        sign.append('+')
        now += 1
    if stack[-1] == num:
        stack.pop()
        sign.append('-')
    else:
        isValid = False
    
if isValid == False:
    print('NO')
else:
    for i in sign:
        print(i)
