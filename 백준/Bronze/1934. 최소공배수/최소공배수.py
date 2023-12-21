for _ in range(int(input())):
    A, B = map(int,input().split())
    result = A*B
    
    while (B>0):
        A, B = B, A%B
    
    print(result//A)