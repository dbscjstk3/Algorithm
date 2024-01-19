def solution(d, budget):
    d.sort()
    i, sum = 0, 0
    while i < len(d):
        if sum + d[i] > budget:
            break
        sum += d[i]
        i += 1
    return i