import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int[] findValidPairHelper(int N, int K) {
        int left = 1;
        int right = K + 1;

        while (right <= N) {
            while (right <= N) {
                int g = gcd(left, right);
                int l = (left * right) / g;

                if (Math.abs(g - l) >= 2 * K) {
                    return new int[]{left, right};
                }
                right++;
            }

            left++;
            right = left + K;
        }

        return null;
    }

    public static int[] findValidPair(int N, int K) {
        int a = K, b = 2 * K;
        if (Math.abs(gcd(a, b) - (a * b) / gcd(a, b)) >= 2 * K) {
            return new int[]{a, b};
        }

        a = N;
        b = N - K;
        if (Math.abs(gcd(a, b) - (a * b) / gcd(a, b)) >= 2 * K) {
            return new int[]{a, b};
        }

        if (2 * K > N) {
            return findValidPairHelper(N, K);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            if (k > n) {
                System.out.println("-1 -1");
                continue;
            }

            int[] result = findValidPair(n, k);
            if (result == null) {
                System.out.println("-1 -1");
            } else {
                System.out.println(result[0] + " " + result[1]);
            }
        }

        scanner.close();
    }
}
