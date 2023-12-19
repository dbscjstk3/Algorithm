apple = [int(input()) for _ in range(3)]
banana = [int(input()) for _ in range(3)]
a = apple[0]*3 + apple[1]*2 + apple[2]*1
b = banana[0]*3 + banana[1]*2 + banana[2]*1

if a == b:
    print('T')
elif a > b:
    print('A')
else:
    print('B')