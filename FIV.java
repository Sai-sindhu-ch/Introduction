import java.util.*;
import java.io.*;
public class FIV {
	public static void main(String args[]) {
		double presentValue,interestValue,time;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter present value:");
		presentValue=sc.nextInt();
		 System.out.print("Enter the interest rate: ");
		 interestValue=sc.nextInt();
		System.out.print("Enter the time period in years: ");
		 time=sc.nextInt();
		 double f=presentValue*Math.pow((1+interestValue/100),time);
		 System.out.println("value is: "+f);
	}

}
