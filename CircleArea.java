import java.util.*;
import java.io.*;
public class CircleArea{
	public static void main(String args[]){
		int r;
		double pi=3.14;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle:");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("area of circle=" +area);
	}
}
