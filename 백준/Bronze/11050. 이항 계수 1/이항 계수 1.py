import math
n, k = map(int,input().split())

def bino_coef_factorial(n, k):
	return math.factorial(n) // math.factorial(k) // math.factorial(n-k)

print(bino_coef_factorial(n,k))