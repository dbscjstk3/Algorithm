N, M = map(int,input().split())

def gcd(a,b):
    while b > 0:
        a, b = b, a % b
    return a

print(gcd(N,M))
print(N*M // gcd(N,M))