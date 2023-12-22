N = int(input())
arr = list(input())

if arr.count('A') > arr.count('B'):
    print('A')
elif arr.count('A') == arr.count('B'):
    print('Tie')
else:
    print('B')