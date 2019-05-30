import java.util.*;
import java.io.*;
public class TSCylinderArea{
	public static void main(String args[]){
		double r,h,area;
		double pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		r=sc.nextDouble();
		System.out.println("enter the heigth:");
		h=sc.nextDouble();
		area=(2*pi*r*h)+(2*pi*r*r);
		System.out.println("total surface area of cylinder=" + area);
	}
}
