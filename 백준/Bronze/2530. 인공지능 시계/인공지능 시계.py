h, m, s = map(int,input().split())
cook = int(input())

s += cook%60
cook //= 60
if s >= 60:
    s -= 60
    m += 1

m += cook%60
cook //= 60
if m >= 60:
    m -= 60
    h += 1

h += cook%24
if h >= 24:
    h -= 24

print(h,m,s)