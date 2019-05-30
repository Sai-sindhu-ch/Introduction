import java.util.*;
import java.io.*;
public class ReverseString {
	public static void main(String args[]) {
		String str,rev=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse of the string=" + rev);
	}

}
