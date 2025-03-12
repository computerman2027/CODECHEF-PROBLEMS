import heapq

t=int(input())

for i in range(t):
    minheap=[]
    minheap2=[]
    n=int(input())
    x1=(input())
    y1=(input())
    x=x1.split()
    y=y1.split()

    pivot=y[0]

    index=x.index(pivot)
    for j in range(n):
        heapq.heappush(minheap,(abs(int(x[j])-int(pivot)),int(x[j])))

    while minheap:
        minheap2.append(heapq.heappop(minheap))
    
    result = " ".join(str(item[1]) for item in minheap2)
    # print(minheap2)
    if y1 ==result:
        print(index+1)
    else:
        print("-1")