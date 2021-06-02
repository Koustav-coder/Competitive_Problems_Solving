import java.util.*;
import java.lang.*;
import java.io.*;

public class Atm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    int x;
		    double y,v;
		    Scanner sc=new Scanner(System.in);
		    x=sc.nextInt();
		    y=sc.nextDouble();
		    if(x%5==0 && y>=x+0.5)
		    {
		        v=(y-x)-0.5;
		        System.out.printf("%.2f",v);
		    }
		    else{
		        System.out.printf("%.2f",y);
		    }
		}
		    catch(Exception e)
		    {
		        return;
		    }
		    
		}
	}