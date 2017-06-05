package test1;
import java.util.*;
import java.math.*;

public class test10 {	
	public static void main(String[] args) {
		int sum = 0;
		int number;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <=4; k++) {
					if(i != j && i != k && j != k) {
						sum += 1;
						number = i * 100 + j * 10 + k;
						System.out.print(number + " ");
					}
				}
			}
		}
		System.out.println("¹²¼Æ£º" + sum + "¸ö¡£");
	}
}  