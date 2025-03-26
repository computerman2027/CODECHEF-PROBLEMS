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

        int i,n,k,j,x;
        for(i=0;i<t;i++)
        {
            n=sc.nextInt();
            k=sc.nextInt();

            if((n==1 && k==1 ) || (n%k!=0) || n==k)
            {
                System.out.println("-1");
                continue;
            }

            int[] ans = new int[n];
            for(j=0;j<n-k;j++)
            ans[j]=j+k+1;
            
            x=1;
            for(;j<n;j++)
            {
                ans[j]=x;
                x++;
            }
            for(j=0;j<n;j++)
            {
                System.out.print(ans[j]+ " ");
            }
            System.out.println();
        }
	}
}
