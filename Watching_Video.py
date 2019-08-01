n,d = map(int, input().split())

arr = list(map(int, input().split()))

k = 0

for i in range(n-1,-1,-1):
    
    if arr[i] == 0:
        
        k += 1
        
    else:
        
        break

pre = [arr[0]]

for i in range(1,n-k):
    
    pre.append(pre[i-1]+arr[i])
    
#flag = 0
    
if pre[-1] - (d*(n-k)) >= 0:
    
    print("1")
    
else:
    
    for i in range(1,n-k):
        
        if (pre[i] - d) + (pre[-1]-pre[i])-(d*(n-k-i-1)) >= 0:
            
            print(i+1)
            
            break
        
    #print(len(pre))
