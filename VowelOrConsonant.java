import java.util.*;
import java.io.*;
public class VowelOrConsonant {
	public static void main(String args[]) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a character:");
		ch=sc.next().charAt(0);
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	         System.out.println("Given character is an vowel");
	      }
		else{
	         System.out.println("Given character is a consonant");
	      }
				
	}
}
