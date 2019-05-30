import java.util.Scanner;
public class Power{
	public static void main(String args[]) {
		double x;
		double  y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		x=sc.nextDouble();
		y=Math.pow(x, 2);
		z=Math.pow(x, 3);
		System.out.println("suare=" +y);
		System.out.println("cube=" +z);
	}
}