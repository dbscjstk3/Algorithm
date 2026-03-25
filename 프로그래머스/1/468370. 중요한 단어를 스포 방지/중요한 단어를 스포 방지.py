def solution(message, spoiler_ranges):
    
    spoilerWords = []
    noSpoilerWords = set()
    
    curIdx = 0
    for word in message.split():
        start = message.find(word, curIdx)
        end = start + len(word) - 1
        curIdx = end + 1
        
        isSpoiler = False
        for s, e in spoiler_ranges:
            if start <= e and end >= s:
                spoilerWords.append(word)
                isSpoiler = True
                break
        
        if not isSpoiler:
            noSpoilerWords.add(word)
            
    importantWords = set()
    for word in spoilerWords:
        if word not in noSpoilerWords:
            importantWords.add(word)
            
    
    return len(importantWords)
            
        