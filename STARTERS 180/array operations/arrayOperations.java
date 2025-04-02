import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }

            if (n == 1) {
                res.add(a[0]);
                continue;
            }

            int k = (n - 1) / 2;
            int m = Arrays.stream(a).max().getAsInt();

            boolean hasMaxInEvenIndex = false;
            for (int i = 0; i < n; i += 2) {
                if (a[i] == m) {
                    hasMaxInEvenIndex = true;
                    break;
                }
            }

            int bonus;
            if (hasMaxInEvenIndex) {
                bonus = k;
            } else {
                bonus = (k - 1 >= 0) ? k - 1 : 0;
            }

            res.add(m + bonus);
        }

        for (int i = 0; i < res.size(); ++i) {
            System.out.println(res.get(i));
        }
    }
}
