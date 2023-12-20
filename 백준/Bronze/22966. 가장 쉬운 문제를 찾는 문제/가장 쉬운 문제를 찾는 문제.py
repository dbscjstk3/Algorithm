N= int(input())
name = []
diff = []
for _ in range(N):
    a, b = input().split()
    name.append(a)
    diff.append(b)
for i in range(len(diff)):
    if diff[i] == min(diff):
        print(name[i])