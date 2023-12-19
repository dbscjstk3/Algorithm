N = int(input())
candidates = [int(input()) for _ in range(N)]

if candidates[0] == max(candidates):
    print('S')
else:
    print('N')