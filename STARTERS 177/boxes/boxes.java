import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  = new Scanner(System.in);
        int t,x,y,k,diff,difffromk;
        t = sc.nextInt();
        int i;
        for(i=1;i<=t;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            k=sc.nextInt();

            diff=(int)Math.abs(x-y);
            difffromk=(int)Math.abs(diff-k);
            if(difffromk%2==0)
            {
                System.out.println(difffromk/2);
            }
            else
            {
                System.out.println("-1");
            }
        }

	}
}
