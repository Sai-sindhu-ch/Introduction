import java.util.*;
import java.io.*;
public class ElecBill{
	public static void main(String args[]){
		int units;
		double bill=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of units:");
		units=sc.nextInt();
		if(units<100){
			bill=units*1.20;
		}
		else if(units<300){
			bill=units*2.0;
		}
		else if(units>300){
			bill=units*3.5;
		}
		System.out.println("bill paid is:" + bill);
	}
}
