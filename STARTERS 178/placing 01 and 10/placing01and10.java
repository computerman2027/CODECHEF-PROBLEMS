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

        int i,x,y,m,ans;
        for(i=0;i<t;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            m=(int)Math.min(x,y);
            ans=(m*2);
            if(((x+y-(2*m))*2)>0)
            {
                ans+=(((x+y-(2*m))*2)-1);
            }
            System.out.println(ans);
        }
        
	}
}
