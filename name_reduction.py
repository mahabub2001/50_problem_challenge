t=int(input())
for x in range(t):
    name=input()
    name1=name.replace(" ","")
    name2=''.join(sorted(name1))
    num=int(input())
    s=''
    for i in range(num):
        temp=input()
        s+=temp
    str1=''.join(sorted(s))
    
    for j in str1:
        if j in name2:
            name2=name2.replace(j,'',1)
            flag=1 
        else:
            flag=-1
            break
        
    if flag==1:
        print("YES")
    else:
        print("NO")
    
