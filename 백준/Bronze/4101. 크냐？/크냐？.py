while True:
    T, C = map(int,input().split())
    if T == 0 and C == 0:
        break
    else:
        print('Yes') if T > C else print('No') 