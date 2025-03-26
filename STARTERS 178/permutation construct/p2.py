def solve():
    import sys
    input_data = sys.stdin.read().strip().split()
    t = int(input_data[0])
    output_lines = []
    index = 1
    for _ in range(t):
        N = int(input_data[index]); K = int(input_data[index+1])
        index += 2
        
        # Special case for K == 1: we need a derangement of [1...N]
        if K == 1:
            if N == 1:
                output_lines.append("-1")
            else:
                # simple cyclic shift: [2,3,...,N,1]
                perm = list(range(2, N+1)) + [1]
                output_lines.append(" ".join(map(str, perm)))
            continue
        
        # For K > 1, check feasibility: every group G_r must have at least 2 elements.
        groups = {}
        possible = True
        for r in range(K):
            groups[r] = []
        for i in range(1, N+1):
            r = i % K
            groups[r].append(i)
        for r in range(K):
            if len(groups[r]) == 1:
                possible = False
                break
        
        if not possible:
            output_lines.append("-1")
            continue
        
        # Construct the permutation array (1-indexed)
        P = [0] * (N + 1)
        # For each residue group, perform a cyclic shift
        for r in range(K):
            group = groups[r]
            m = len(group)
            for j in range(m):
                # assign group[j] to the position group[(j+1) % m]
                pos = group[j]
                P[pos] = group[(j + 1) % m]
        
        # Convert 1-indexed result to answer (ignoring index 0)
        output_lines.append(" ".join(map(str, P[1:])))
    
    sys.stdout.write("\n".join(output_lines))
    
if __name__ == '__main__':
    solve()
