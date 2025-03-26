import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t,n,k,i,j,difference;
        int[] A;
        int[] B;

        t=sc.nextInt();

        while (t>0) {
            n=sc.nextInt();
            k=sc.nextInt();
            A=new int[n];
            B=new int[n];

            for(i=0;i<n;i++)
            A[i]=sc.nextInt();
            for(i=0;i<n;i++)
            B[i]=sc.nextInt();

            int noofflip=0;
            int minimumflip=Integer.MAX_VALUE;
            for(i=0;i<n;i++)
            {
                difference = (int)Math.abs(A[i]-B[i]);

                int r1;
                int r2;
                if(difference==0)
                {
                    r1=0;
                    r2=9;
                }
                else
                {
                    int up = difference;
                    int down = 9-difference;

                    if(up<=down)
                    {
                        r1=up;
                        r2=down-up;
                    }
                    else
                    {
                        r1=down;
                        r2=up-down;
                    }
                }
                noofflip+=r1;
                if(r2<minimumflip)
                {
                    minimumflip=r2;
                }
            }

            int noofmovesavailable = k-noofflip;
            if(noofmovesavailable<0)
            {
                System.out.println("NO");
            }
            else if(noofmovesavailable%2==0)
            {
                System.out.println("YES");
            }
            else
            {
                if(minimumflip<=noofmovesavailable)
                {
                    System.out.println("YES");
                }
                else
                System.out.println("NO");
            }
            t--;
        }
	}
}
