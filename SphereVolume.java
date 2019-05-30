import java.util.*;
import java.io.*;
public class SphereVolume{
	public static void main(String args[]){
		double pi=3.14;
		double volume,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		r=sc.nextDouble();
		volume=4/3*(pi*r*r*r);
		System.out.println("volume of sphere="+ volume);
	}
}
