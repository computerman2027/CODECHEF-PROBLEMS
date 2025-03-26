import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int ans = b*10;
        if(n>=ans)
        System.out.print("YES");
        else
        System.out.print("NO");
	}
}
