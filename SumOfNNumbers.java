import java.util.*;
import java.io.*;
public class SumOfNNumbers {
	public static void main(String args[]) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of integers:");;
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the numbers in array:");;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of"+n+"numbers is=" + sum);
	}
}
