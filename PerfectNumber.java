import java.util.*;
import java.io.*;
public class PerfectNumber {
	public static void main(String args[]) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");;
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(n%1==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+ "is a perfect number");
			
		}
		else {
			System.out.println(n+ "is not a perfect number");
		}
	}
}
