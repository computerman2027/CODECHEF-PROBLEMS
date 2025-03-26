import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();
        int n,q,i;
        while (t>0) 
        {
            n=sc.nextInt();
            int sum=0;
            int c[]=new int[n];
            for(i=0;i<n;i++)
            {
                c[i]=sc.nextInt();
                sum+=c[i];
            }
            q=sc.nextInt();
            Arrays.sort(c);
            while (q>0) 
            {
                int crew=sc.nextInt();
                int storage=sc.nextInt();
                int high=n-1;
                int low=0;
                int mid;
                int extra =0,sum1=sum ;
                int crewsize=0,best=-1;
                while (low<=high) {
                    mid=low+(high-low)/2;

                    if(c[mid]==crew)
                    {
                        crewsize=c[mid];
                        break;
                    }
                    else if(c[mid]<crew)
                    {
                        crewsize=c[mid];
                        low=mid+1;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
                high=n-1;
                low=0;
                while (low <= high) {
                    mid = low + (high - low) / 2;
        
                    if (c[mid] >= crew) {
                        best = c[mid];  
                        high = mid - 1;  
                    } else {
                        low = mid + 1;
                    }
                }
                System.out.println("b = "+best+ " crewsize = "+crewsize);
                if( crewsize==crew)
                {
                    sum1-=crew;
                }
                else if(best>=crew )
                {
                    sum1-=best;
                }
                
                else
                {
                    extra = crew-crewsize;
                    sum1-=crewsize;
                }
                System.out.println("size = "+sum1);
                if(sum1<storage)
                {
                    extra+=(storage-sum1);
                }
                System.out.println(extra);
                q--;    
            }

            t--;    
        }
	}
}
