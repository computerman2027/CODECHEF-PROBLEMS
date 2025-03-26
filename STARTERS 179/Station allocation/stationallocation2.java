import java.util.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int[] c = new int[n];

            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
                sum += c[i];
            }

            Arrays.sort(c); 

            int q = sc.nextInt();
            while (q-- > 0) {
                int crew = sc.nextInt();
                int storage = sc.nextInt();

                int GLB = findLowerBound(c, crew); 
                int LUB = findUpperBound(c, crew); 

                long minExtra = Long.MAX_VALUE;

               
                if (GLB != -1) {
                    int sum1 = sum - c[GLB];
                    long extra = (c[GLB] < crew) ? (crew - c[GLB]) : 0;
                    if (sum1 < storage) {
                        extra += (storage - sum1);
                    }
                    minExtra = Math.min(minExtra, extra);
                }

                
                if (LUB != -1) {
                    int sum1 = sum - c[LUB];
                    long extra = (c[LUB] < crew) ? (crew - c[LUB]) : 0;
                    if (sum1 < storage) {
                        extra += (storage - sum1);
                    }
                    minExtra = Math.min(minExtra, extra);
                }

                System.out.println(minExtra);
            }
        }
        sc.close();
    }

    static int findLowerBound(int[] c, int crew) {
        int low = 0, high = c.length - 1, best = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (c[mid] <= crew) {
                best = mid; 
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return best;
    }

    static int findUpperBound(int[] c, int crew) {
        int low = 0, high = c.length - 1, best = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (c[mid] >= crew) {
                best = mid; 
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return best;
    }
}
