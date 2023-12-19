S = list(map(int,input().split()))

if sum(S) >= 100:
    print("OK")
else:
    if S[0] == min(S):
        print("Soongsil")
    elif S[1] == min(S):
        print("Korea")
    else:
        print("Hanyang")