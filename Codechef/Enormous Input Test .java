import java.util.*;
import java.lang.*;
import java.io.*;
class Something
{
       
	public static void main (String[] args) throws java.lang.Exception
	{
	  try{
               int n,k,c=0;
               Scanner sc=new Scanner(System.in);
               n=sc.nextInt();
               k=sc.nextInt();
               
               
               for(int i=0;i<n;i++)
               {
                 int t;
                 t=sc.nextInt();
                 if(t%k==0)
                 c=c+1;
                }
               System.out.println(c);
               }
             catch(Exception e)
	     {
	        return;
	     }
  }
}
