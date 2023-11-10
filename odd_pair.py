import math
t=int(input())
for i in range(t):
    a=int(input())
    if a%2==0:
        res=int(a*(a/2))
        print(res)
    else:
        res2=int((a-1)*(math.floor(a//2)+1))
        print(res2)