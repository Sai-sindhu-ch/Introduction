import java.util.*;
import java.io.*;
public class ParallelogramPerimeter{
	public static void main(String args[]){
		double b,s,perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base:");
		b=sc.nextDouble();
		System.out.println("enter the side:");
		s=sc.nextDouble();
		perimeter=2*(b+s);
		System.out.println("perimeter of parallelogram=" + perimeter);
	}
}
		
