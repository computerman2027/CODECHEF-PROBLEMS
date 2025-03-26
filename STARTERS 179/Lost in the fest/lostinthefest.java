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
        int n,h,i,actualheight;
        while (t>0) 
        {
            n=sc.nextInt();
            int[] arr = new int[n];

            for(i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            actualheight=arr[n-1];

            for(i=0;i<n;i++)
            {
                if(arr[i]>actualheight)
                break;
            }

            System.out.println((n-i-1));

            t--;   
        }
	}
}
