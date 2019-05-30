import java.util.*;
import java.io.*;
public class TriangleArea{
	public static void main(String args[]){
		double w,h;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height:");
		h=sc.nextDouble();
		System.out.println("enter the width:");
		w=sc.nextDouble();
		area=(h*w)/2;
		System.out.println("area of triangle=" +area);
	}
}
