import sys
input = sys.stdin.readline

n, m = map(int, input().split())

dic = dict()

for _ in range(n):
    key, value = input().split()
    dic[key] = value

out = []
for _ in range(m):
    site = input().strip()
    out.append(dic[site])

print("\n".join(out))