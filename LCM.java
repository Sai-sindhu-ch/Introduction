import java.util.*;
import java.io.*;
public class LCM {
	public static void main(String args[]) {
		int a,b,max,lcm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		a=sc.nextInt();
		System.out.println("enter second number:");
		b=sc.nextInt();
	 	 max=a>b?a:b;
		     for(int i=0;i<max;i++)
		     {
		         if(max%a==0 && max%b==0)
		         {
		         	lcm=max;
		             break;
		         }
		         max++;
		     }
		     System.out.println("LCM of the two numbers = "+lcm);
	}

}
