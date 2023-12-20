T, S = map(int,input().split())
if (T < 12 or T > 16) or S == 1:
    print(280)
elif (T >= 12 or T <= 16) and S == 0:
    print(320)