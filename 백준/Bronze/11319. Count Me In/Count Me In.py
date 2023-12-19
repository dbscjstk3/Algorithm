for _ in range(int(input())):
    sentence = input()
    Vowels = ['A','E','I','O','U','a','e','i','o','u']
    cnt = 0
    cnt1 = 0
    for i in sentence:
        if i == ' ':
            continue
        elif i in Vowels:
            cnt += 1
        else:
            cnt1 += 1
    print(cnt1,cnt)