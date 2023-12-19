games = []
for i in range(6):
    games.append(input())

if games.count('W') == 5 or games.count('W') == 6:
    print(1)
if games.count('W') == 3 or games.count('W') == 4:
    print(2)
if games.count('W') == 1 or games.count('W') == 2:
    print(3)
if games.count('W') == 0:
    print(-1)