import java.util.*;
import java.io.*;
public class AverageMarks {
	public static void main(String args[]) {
		int n,marks,sum;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of subjects:");;
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter subject marks:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			avg=avg+a[i];
		}
		System.out.println("average marks=" + avg);
		
	}

}
