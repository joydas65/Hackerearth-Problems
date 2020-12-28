for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    d = dict()
    
    for i,j in enumerate(arr):
        
        if j in d:
            
            d[j][1][1] = i
            
        else:
            
            d[j] = [j,[i,i]]
            
    ans = 0
            
    for i in d:
        
        ans += (d[i][1][1] - d[i][1][0])
        
    print(ans)
