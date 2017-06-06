package test1;
import java.util.*;
import java.math.*;
import java.text.*;

public class test13 {	
	public static void main(String[] args) throws ParseException {
		int x, y, z;
		Scanner in = new Scanner (System.in);
		System.out.println("Please input x: ");
		x = in.nextInt();
		System.out.println("Please input y: ");
		y = in.nextInt();
		System.out.println("Please input z: ");
		z = in.nextInt();
		System.out.println("排列后的顺序为： ");
		
		if (x > y && x > z) {
			if (y > z) {
				System.out.print(z + "<" + y + "<" + x);
			}
			else {
				System.out.print(y + "<" + z + "<" + x);
			}
		}
		if (y > x && y > z) {
			if (x > z) {
				System.out.print(z + "<" + x + "<" + y);
			}
			else {
				System.out.print(x + "<" + z + "<" + y);
			}
		}
		else {
			if (y > x) {
				System.out.print(x + "<" + y + "<" + z);
			}
			else {
				System.out.print(y + "<" + x + "<" + z);
			}
		}
	}
}  