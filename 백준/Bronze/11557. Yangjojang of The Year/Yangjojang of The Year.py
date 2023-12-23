for _ in range(int(input())):
    S,L = [],[]
    for i in range(int(input())):
        s,l = input().split()
        S.append(s)
        L.append(int(l))
    for i in range(len(L)):
        if L[i] == max(L):
            print(S[i])