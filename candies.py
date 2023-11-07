t=int(input())
for _ in range(t):
    n=int(input())
    l=list(map(int,input().split()))
    size=n*2
    #i=0
    for i in range(size):
        
            cnt=l.count(l[i])   
        
        

    if cnt>2:
        print("NO")
    else:
        print("YES")
