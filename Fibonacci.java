package JavaPrograms_Internship;
import java.util.*;

public class Fibonacci {
	public static void main(String args[])
	 {
	         int i,c=0,n;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number to generate fibonacci series for first n terms");
	     n=sc.nextInt();
	   int a=0;
	   int b=1;
	 
	 System.out.println("Fibonacci series for first "+n+" terms");
	   for(i=0;i<n;i++)
	   {
	       System.out.print(c+" ");
	       a=b;
	       b=c;
	       c=a+b;
	   }
	 }
}
