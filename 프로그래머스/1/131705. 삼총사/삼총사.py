def solution(n):
    answer = 0
    for i in range(len(n)-2):
        for j in range(i+1,len(n)):
            for k in range(j+1,len(n)):
                if n[i]+n[j]+n[k] == 0:
                    answer += 1

    return answer