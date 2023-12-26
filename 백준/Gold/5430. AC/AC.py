from collections import deque
import sys

for _ in range(int(input())):
    AC = sys.stdin.readline().strip()
    n = int(input())
    arr = sys.stdin.readline().strip()[1:-1].split(',')
    queue = deque(arr)
    
    rev, flag = 0, 0

    if n == 0:
        queue = []

    for i in AC:
        if i == 'R':
            rev += 1
        elif i == 'D':
            if len(queue) < 1:
                flag = 1
                print("error")
                break
            else:
                if rev % 2 == 0:
                    queue.popleft()
                else:
                    queue.pop()

    if flag == 0:
        if rev % 2 == 0:
            print("["+",".join(queue)+"]")
        else:
            queue.reverse()
            print("["+",".join(queue)+"]")