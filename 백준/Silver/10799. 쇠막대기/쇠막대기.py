import sys

pipes = list(sys.stdin.readline().rstrip())
stack = []
length = 0

for i in range(len(pipes)):
    if pipes[i] == "(":
        stack.append('(')
    else:
        if pipes[i-1] == '(':
            stack.pop()
            length += len(stack)
        else:
            stack.pop()
            length += 1

print(length)