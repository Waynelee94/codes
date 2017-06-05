package test1;
import java.util.*;
import java.math.*;

public class test7 {	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please input a number:");
		int num1 = in.nextInt();
		System.out.println("Please input how many times you wanna add:(no less than 1)");
		int num2 = in.nextInt();
		System.out.println(Result(num1, num2));
	}

	private static int Result(int num1, int num2) {
		int sum = num1;
		int i;
		if (num2 == 1) {
			return num1;
		}
		else {
			for (i = 2; i <= num2; i++) {
				int temp = (int) (sum + num1 * Math.pow(10, i-1));
				sum += temp;
				temp = 0;
			}
		}
		return sum;
	}
}