import java.util.*;
import java.io.*;
public class Fibonacci{
	public static void main(String args[]){
		int n,n1=0,n2=1,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		for(int i=1;i<n;i++){
			System.out.println(n1 + " ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}
}
			
		
