t=int(input())
while t!=0:
    #n=int(input())
    #k=int(input())
    a=list(map(int,input().split()))
    l=list(map(int,input().split()))
    i=0
    x=0
    flag=True
    for i in range(len(l)):
        if l[i]+x>=a[1]:
            x=x+(l[i]-a[1])
        else:
            flag=False
            p=i
            break
        
    if flag==True:
        print("YES")
    else:
        print("NO ",p+1)
    t=t-1