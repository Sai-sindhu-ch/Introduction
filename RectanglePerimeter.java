import java.util.*;
import java.io.*;
public class RectanglePerimeter{
	public static void main(String args[]){
		double l,w,perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		l=sc.nextDouble();
		System.out.println("enter the width:");
		w=sc.nextDouble();
		perimeter=2*(l+w);
		System.out.println("perimeter of parallelogram=" + perimeter);
	}
}
		
