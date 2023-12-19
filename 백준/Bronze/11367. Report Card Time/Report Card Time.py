for _ in range(int(input())):
    name, score = input().split()
    if int(score) >= 97:
        print(name,'A+')
    elif int(score) >= 90:
        print(name,'A')
    elif int(score) >= 87:
        print(name,'B+')
    elif int(score) >= 80:
        print(name,'B')
    elif int(score) >= 77:
        print(name,'C+')
    elif int(score) >= 70:
        print(name,'C')
    elif int(score) >= 67:
        print(name,'D+')
    elif int(score) >= 60:
        print(name,'D')
    else:
        print(name,'F')