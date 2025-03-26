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
def find_valid_pair(N, K):

    
    # First try (K, 2K)
    a, b = K, 2 * K
    if abs(gcd(a, b) - (a * b) // gcd(a, b)) >= 2 * K:
        return (a, b)

    # Try (N, N-K)
    a, b = N, N - K
    if abs(gcd(a, b) - (a * b) // gcd(a, b)) >= 2 * K:
        return (a, b)
    
    if 2 * K > N:
        return findvalidpair(N,K)
    return (-1, -1)  # No valid pair found

t = int(input()) 
for _ in repeat(None, t):
    i1=input().split()
    n=int(i1[0])
    k=int(i1[1])

    if k > n:
        print("-1 -1")
        continue

    a, b = find_valid_pair(n, k)
    print(a, b)
