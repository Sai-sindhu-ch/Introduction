import java.util.*;
import java.io.*;
public class IsoTriangleArea{
	public static void main(String args[]){
		double b,h;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height:");
		h=sc.nextDouble();
		System.out.println("enter the breadth:");
		b=sc.nextDouble();
		area=(h*b)/2;
		System.out.println("area of isoceles triangle=" +area);
	}
}
