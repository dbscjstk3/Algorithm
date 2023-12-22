T = int(input())
A,B,C = 300,60,10
a,b,c = 0,0,0

while True:
    while A<=T:
        a += 1
        T -= A
    while B <= T:
        b += 1
        T -= B
    while C <= T:
        c += 1
        T -= C
    break

if T == 0:
        print(a,b,c)
else:
        print(-1)