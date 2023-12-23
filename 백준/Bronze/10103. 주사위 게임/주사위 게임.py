sum = 0
X, Y = 100, 100
for _ in range(int(input())):
    x,y = map(int,input().split())
    if x > y:
        Y -= x
    elif x < y:
        X -= y
    
print(X)
print(Y)