import java.util.*;
import java.io.*;
public class CirclePerimeter{
	public static void main(String args[]){
		double pi=3.14;
		int r;
		double perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		r=sc.nextInt();
		perimeter=2*(pi*r);
		System.out.println("perimeter of circle=" +perimeter);
	}
}
