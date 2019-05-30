import java.util.*;
import java.io.*;
public class CompoundInterest {
	public static void main(String args[]) {
		double principleAmount,interestRate,time;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle amount:");
		principleAmount=sc.nextDouble();
		System.out.println("enter interest rate:");
		interestRate=sc.nextDouble();
		System.out.println("enter time:");
		time=sc.nextDouble();
		double ci=principleAmount*(Math.pow((1+interestRate/ 100), time));
		System.out.println("compound interest=" +ci);
		
	}

}
