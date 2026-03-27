def solution(survey, choices):
    answer = ''
    
    types = 'RTCFJMAN'
    index = {}
    
    for t in types:
        index[t] = 0
        
    for i in range(len(survey)):
        left = right = 0
        
        if choices[i] <= 3:
            left += (4-choices[i])
        elif choices[i] >= 5:
            right += (choices[i]-4)
            
        if left > right:
            index[survey[i][0]] += left
        elif left < right:
            index[survey[i][1]] += right
            
    for i in range(0, len(types), 2):
        if index[types[i]] > index[types[i+1]]:
            answer += types[i]
        elif index[types[i]] == index[types[i+1]]:
            answer += min(types[i], types[i+1])
        else:
            answer += types[i+1]
            
        
    return answer