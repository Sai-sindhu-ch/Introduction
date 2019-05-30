import java.util.*;
import java.io.*;
public class CSCubeArea{
	public static void main(String args[]){
		double s;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side:");
		s=sc.nextDouble();
		area=4*s*s;
		System.out.println("curved surface area of cube="+ area);
	}
}
