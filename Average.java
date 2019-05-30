import java.util.*;
import java.io.*;
public class Average{
	public static void main(String args[]){
		int n;
		double sum=0,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of integers:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the integers in array:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("average of numbers=" +avg);
	}
}
		
