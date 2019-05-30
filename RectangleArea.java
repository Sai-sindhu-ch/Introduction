import java.util.*;
import java.io.*;
public class RectangleArea{
	public static void main(String args[]){
		double w,l;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the width:");
		w=sc.nextDouble();
		System.out.println("enter the length:");
		l=sc.nextDouble();
		area=w*l;
		System.out.println("area of rectangle=" + area);
	}
}
