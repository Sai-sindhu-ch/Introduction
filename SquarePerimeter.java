import java.util.*;
import java.io.*;
public class SquarePerimeter{
	public static void main(String args[]){
		double s;
		double perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side:");
		s=sc.nextDouble();
		perimeter=4*s;
		System.out.println("perimeter of square="+ perimeter);
	}
}
