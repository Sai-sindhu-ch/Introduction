import java.util.*;
import java.io.*;
public class LeapYear {
	public static void main(String args[]) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any year:");
		year=sc.nextInt();
		Boolean leap=false;
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else {
            leap = false;
        }
		if(leap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
	}

}
