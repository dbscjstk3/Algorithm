def to_days(date):
    y, m, d = map(int, date.split("."))
    
    return y*12*28 + m*28 + d

def solution(today, terms, privacies):
    answer = []
    
    today = to_days(today)
    
    dic = dict()
    for t in terms:
        type_, period = t.split()
        dic[type_] = period
        
    for i, p in enumerate(privacies):
        idx = i + 1
        date, _type = p.split()
        
        if to_days(date) + int(dic[_type]) * 28 <= today:
            answer.append(idx)
            
    return answer
            
        
    
        