import java.util.*;
import java.io.*;
public class ParallelogramArea{
	public static void main(String args[]){
		double b,h;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height:");
		h=sc.nextDouble();
		System.out.println("enter the breadth:");
		b=sc.nextDouble();
		area=(h*b);
		System.out.println("area of parallelogram=" +area);
	}
}
