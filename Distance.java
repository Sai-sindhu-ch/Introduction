import java.util.*;
import java.io.*;
import java.math.*;
public class Distance{
	public static void main(String args[]){
		int x1,x2,y1,y2;
		double dist;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x1 value:");
		x1=sc.nextInt();
		System.out.println("enter y1 value:");
		y1=sc.nextInt();
		System.out.println("enter x2 value:");
		x2=sc.nextInt();
		System.out.println("enter y2 value:");
		y2=sc.nextInt();
		dist=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println("distancce between two points=" +dist);
	}
}
