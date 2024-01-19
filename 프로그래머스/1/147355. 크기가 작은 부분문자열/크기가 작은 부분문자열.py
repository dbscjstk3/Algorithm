def solution(t,p):
    answer = 0
    arr = []
    for i in range((len(t)-len(p))+1):
        arr.append(t[i:i+len(p)])
    for i in arr:
        if int(i) <= int(p):
            answer += 1
    return answer