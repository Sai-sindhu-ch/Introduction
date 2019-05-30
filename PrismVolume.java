import java.util.*;
import java.io.*;
public class PrismVolume{
	public static void main(String args[]){
		double b,h,volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base:");
		b=sc.nextDouble();
		System.out.println("enter the heigth:");
		h=sc.nextDouble();
		volume=b*h;
		System.out.println("volume of prism=" + volume);
	}
}
