i = 1
while True:
    n = int(input())
    if n == 0:
        break
    else:
        n_1 = 3 * n
        if n_1 % 2 == 0:
            n_2 = n_1//2
            n_3 = 3 * n_2
            n_4 = n_3 // 9
            print(f'{i}.','even',f'{n_4}')
        else:
            n_2 = (n_1+1)//2
            n_3 = 3 * n_2
            n_4 = n_3 // 9
            print(f'{i}.','odd',f'{n_4}')
    i += 1