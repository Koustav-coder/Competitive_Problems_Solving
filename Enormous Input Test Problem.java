Enormous Input Test Problem Code: INTESTSolvedSubmit

 
The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least 2.5MB of input data per second at runtime.

Input
The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer ti, not greater than 109, each.

Output
Write a single integer to output, denoting how many integers ti are divisible by k.

Example
Input:
7 3
1
51
966369
7
9
999996
11

Output:
4
  --------------------------------------------------------------------------------------------------------------------
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
