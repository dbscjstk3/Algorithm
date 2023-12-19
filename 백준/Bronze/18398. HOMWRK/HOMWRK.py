for _ in range(int(input())):
    probs = int(input())
    for _ in range(probs):
        A, B = map(int,input().split())
        print((A+B),(A*B))
        