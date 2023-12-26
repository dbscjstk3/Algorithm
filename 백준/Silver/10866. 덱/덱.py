import sys

deck = []

for _ in range(int(input())):
    order = sys.stdin.readline().split()
    if order[0] == 'push_front':
        deck.insert(0, order[1])
    elif order[0] == 'push_back':
        deck.append(order[1])
    elif order[0] == 'pop_front':
        if len(deck):
            print(deck.pop(0))
        else:
            print(-1)
    elif order[0] == 'pop_back':
        if len(deck):
            print(deck.pop())
        else:
            print(-1)
    elif order[0] == 'size':
        print(len(deck))
    elif order[0] == 'empty':
        if len(deck):
            print(0)
        else:
            print(1)
    elif order[0] == 'front':
        if len(deck):
            print(deck[0])
        else:
            print(-1)
    elif order[0] == 'back':
        if len(deck):
            print(deck[-1])
        else:
            print(-1)