while True:
    n = int(input())
    sum = 0
    if n == 0:
        break
    else:
        for i in range(n,0,-1):
            sum += i
    print(sum)