import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int f1=sc.nextInt();
        int p1=sc.nextInt();
        int f2=sc.nextInt();
        int p2=sc.nextInt();

        int d1=(int)Math.abs(f1-p1);
        int d2=(int)Math.abs(f2-p2);

        if(d1>d2)
        System.out.print("First");
        else if(d1<d2)
        System.out.println("Second");
        else
        System.out.println("Both");


	}
}
