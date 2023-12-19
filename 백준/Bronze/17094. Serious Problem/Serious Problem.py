leng = int(input())
words = list(input())

cnt_e = words.count('e')
cnt_2 = words.count('2')

if cnt_e == cnt_2:
    print("yee")
elif cnt_e > cnt_2:
    print("e")
else:
    print(2)