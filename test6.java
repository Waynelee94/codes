package test1;
import java.util.*;
import java.math.*;

public class test6 {	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please input the first number:");
		int num1 = in.nextInt();
		System.out.println("Please input the second number:");
		int num2 = in.nextInt();
		System.out.println("最大公约数为： " + maxDivisor(num1, num2));
		System.out.println("最小公倍数为： " + maxMultiple(num1, num2));
	}

	private static int maxDivisor(int num1, int num2) {
		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if (num1 % num2 ==0) {return num2;}
		while (num1 % num2 != 0) {
			return maxDivisor(num2, num1 % num2);
		}
		return num2;
	}
	private static int maxMultiple(int num1, int num2) {
		return num1 * num2 /maxDivisor(num1, num2);
	}
}