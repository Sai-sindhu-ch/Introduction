import java.util.*;
import java.io.*;
public class CylinderVolume{
	public static void main(String args[]){
		double r,h,volume;
		double pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		r=sc.nextDouble();
		System.out.println("enter the heigth:");
		h=sc.nextDouble();
		volume=(pi*r*r)*h;
		System.out.println("volume of cylinder="+ volume);
	}
}
