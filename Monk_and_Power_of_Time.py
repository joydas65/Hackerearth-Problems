n = int(input())

call = list(map(int, input().split()))

actual = list(map(int, input().split()))

time_taken = 0

while call != []:
    
    if call[0] != actual[0]:
        
        call = call[1:] + [call[0]]
        
        time_taken += 1
        
    else:
        
        if len(call) > 1:
        
            call = call[1:]
            
            actual = actual[1:]
            
        else:
            
            time_taken += 1
            
            break
        
        time_taken += 1
        
print(time_taken)
