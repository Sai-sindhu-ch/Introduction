import java.util.*;
import java.io.*;
public class Deprecation {
	public static void main(String args[]) {
		double amount,deppercent,year,afterdep,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		amount=sc.nextDouble();
		System.out.println("enter Depreciation percentage");
		deppercent=sc.nextDouble();
		System.out.println("enter  number of years");
		year=sc.nextDouble();
		temp=amount;
		for(int i=0;i<year;i++)
		temp=((100-deppercent)*temp)/100;
		System.out.println("after deprecation = "+temp);
	}

}
