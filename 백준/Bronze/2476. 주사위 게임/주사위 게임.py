answer = []
for _ in range(int(input())):
    x, y, z = map(int,input().split())

    if x == y == z:
        answer.append(10000+x*1000)
    elif (x == y) or (x == z):
        answer.append(1000+x*100)
    elif y == z:
        answer.append(1000+y*100)
    else:
        answer.append(max(x,y,z)*100)
        
print(max(answer))
