a, b = map(int,input().split())

if a > b:
    lst = []
    for i in range(b+1,a):
        lst.append(i)
    print(len(lst))
    for i in lst:
        print(i, end = ' ')
elif b > a:
    lst = []
    for i in range(a+1,b):
        lst.append(i)       
    print(len(lst))
    for i in lst:
        print(i, end = ' ')

elif a == b:
    print(0)
    print()