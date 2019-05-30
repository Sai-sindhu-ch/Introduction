import java.util.*;
import java.math.*;
public class EqTriangleArea{
	public static void main(String args[]){
		double area;
		double s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side :");
		s=sc.nextDouble();
		area=(Math.sqrt(3)/4)*s*s;
		System.out.println("area of equilateral triangle=" + area);
	}
}
