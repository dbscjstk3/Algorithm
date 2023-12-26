import sys

hobbit = []
for _ in range(9):
    hobbit.append(int(sys.stdin.readline()))

total = sum(hobbit)

for i in range(9):
    for j in range(i+1,9):
        if total - (hobbit[i] + hobbit[j]) == 100:
            a = hobbit[i]
            b = hobbit[j]

hobbit.remove(a)
hobbit.remove(b)
for i in sorted(hobbit):
    print(i)