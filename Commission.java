import java.util.*;
import java.io.*;
public class Commission {
	public static void main(String args[]){
		int amount;
		double commission;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount:");
		amount=sc.nextInt();
		System.out.println("enter commission :");
		commission=sc.nextDouble();
		commission =(commission/100)*amount;
		System.out.println("commission percentage=" + commission);
	}
}
