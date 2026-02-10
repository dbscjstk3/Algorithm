def solution(friends, gifts):
    lst = {}
    n = len(friends)

    for i in range(n):
        lst[friends[i]] = i #{'muzi' : 0, 'ryan' : 1, 'frodo' : 2, 'neo' : 3}

    table = [[0] * (n) for _ in range(n)] #[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

    #선물지수
    gift_score = [0] * n #[0,0,0,0]
    
    for gift in gifts:
        giver, getter = gift.split()
        gift_score[lst[giver]] += 1
        gift_score[lst[getter]] -= 1
        table[lst[giver]][lst[getter]] += 1

    #선물받을 개수
    gift_count = [0] * (n)
    answer = 0
    
    for i in range(n):
        for j in range(n):
            if i == j: 
                continue
            if table[i][j] > table[j][i]:
                gift_count[i] += 1
            elif table[i][j] == table[j][i]:
                if gift_score[i] > gift_score[j]:
                    gift_count[i] += 1
    
    answer = max(gift_count)
    return answer

