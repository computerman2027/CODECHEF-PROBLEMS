t= int(input())

for j in range(t):
    n=int(input())
    a=input()
    b=input()

    operation=[]

    i=0
    flag=0
    while i<n:
        # print("T = ",j,"i = ",i)
        if a[i]==b[i]:
            i+=1
            continue

        start = i
        while i<n and a[i]!=b[i]:
            i+=1
        end=i-1

        operation.append((1,start+1,end+1))
        flag=1
    
    if flag==1:
        print(len(operation))
        for o in operation:
            print(*o)
    if flag==0:
        print("0")