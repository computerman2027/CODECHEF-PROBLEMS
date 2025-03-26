from math import gcd
from itertools import repeat

def findvalidpair(N, K):
    left = 1 
    right = K + 1 

    while right <= N:
        while right <= N:
            g = gcd(left, right)
            l = (left * right) // g  
            
            if abs(g - l) >= 2 * K: 
                return (left, right)
            
            right += 1  

        left += 1 
        right = left + K 

    return None 

t=int(input())
for _ in repeat(None,t):
    i1=input().split()
    n=int(i1[0])
    k=int(i1[1])
    ans=findvalidpair(n,k)
    if(ans==None):
        print("-1")
    else:
        print(ans[0],ans[1])