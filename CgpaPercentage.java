import java.util.*;
import java.io.*;
public class CgpaPercentage {
	public static void main(String args[]) {
		int n;
		double cgpa,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter numbers in array:");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=a[i]/10;
			sum=sum+a[i];
		}
		cgpa=sum/n;
		System.out.println("cgpa="+ cgpa);
		System.out.println("cgpa percentage=" + cgpa * 9.5);
	
	}

}
