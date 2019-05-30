import java.util.*;
import java.io.*;
public class Discount{
	public static void main(String args[]){
		int bill,discount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the bill of product:");
		bill=sc.nextInt();
		System.out.println("enter the discount of product:");
		discount=sc.nextInt();
		int billpaid=bill-(bill*discount/100);
		System.out.println("bill paid after discount of product =" +billpaid);
	}
}
