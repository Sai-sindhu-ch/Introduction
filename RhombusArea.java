import java.util.*;
import java.io.*;
public class RhombusArea{
	public static void main(String args[]){
		double d1,d2;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the diagnol1:");
		d1=sc.nextDouble();
		System.out.println("enter the diagnol2:");
		d2=sc.nextDouble();
		area=(d1 * d2)/2;
		System.out.println("area of rhombus=" +area);
	}
}
