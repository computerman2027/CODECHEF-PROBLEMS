import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b>c && b+c>a && a+c>b)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

	}
}
