for _ in range(int(input())):
    case = list(input().split())
    sum = 0
    sum += float(case[0])
    for i in range(1,len(case)):
        if case[i] == '@':
            sum *= 3
        elif case[i]== '%':
            sum += 5
        elif case[i] == '#':
            sum -= 7
    print(f'{sum:.2f}')