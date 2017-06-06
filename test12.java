package test1;
import java.util.*;
import java.math.*;
import java.text.*;

public class test12 {	
	public static void main(String[] args) throws ParseException {
		int year, month, day;
		Scanner in = new Scanner (System.in);
		System.out.println("Please input year: ");
		year = in.nextInt();
		System.out.println("Please input month: ");
		month = in.nextInt();
		System.out.println("Please input day: ");
		day = in.nextInt();
		int sum = 0;
		Calendar ca = Calendar.getInstance();
		ca.set(year, month - 1, day);
		System.out.println(ca.getTime() + "是当年的第" + ca.get(Calendar.DAY_OF_YEAR) + "天。");
	}
}  