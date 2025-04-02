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

        while (t>0)
        {
            int n= sc.nextInt();   
            int k= sc.nextInt();
            int i;
            String str = sc.next()+sc.nextLine();
            char ch;
            int countof1=0,countof0before1=0,zero=0;

            int l=str.length();

            for(i=0;i<l;i++)
            {
                ch=str.charAt(i);

                if(i==0 && ch=='1')
                {
                    countof1++;
                    continue;
                }
                else
                {
                    if(ch=='0')
                    {
                        zero++;
                    }
                    else if(ch=='1')
                    {
                        countof1++;
                        if(zero!=0)
                        {
                            countof0before1+=zero;
                            zero=0;

                        }
                    }
                }
                
            }

            if(countof0before1>=k)
            {
                System.out.println(k+countof1);
            }
            else
            {
                System.out.println(countof0before1+countof1);
            }
        }
	}
}
