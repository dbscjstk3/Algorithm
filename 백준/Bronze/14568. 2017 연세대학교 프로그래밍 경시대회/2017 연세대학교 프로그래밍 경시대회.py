import sys
input = sys.stdin.readline

n = int(input())

answer = 0
for i in range(1,n+1):
    for j in range(1,n+1):
        for k in range(1,n+1):
            if i + j + k == n:
                if i >= j + 2:
                    if k % 2 == 0:
                        answer += 1


print(answer)