import java.util.*;
import java.io.*;
public class BattingAverage {
	public static void main(String args[]) {
		int totalruns,innings,notout;
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter number of matches:");
		//matches=sc.nextInt();
		System.out.println("enter totalruns:");
		totalruns=sc.nextInt();
		System.out.println("enter innings:");
		innings=sc.nextInt();
		System.out.println("enter number of notouts:");
		notout=sc.nextInt();
		double avg=totalruns/(innings-notout);
		System.out.println("batting average=" + avg);
	}

}
