package test1;
import java.util.*;
import java.math.*;

public class test1 {	
	public static void main(String[] args) {
		int ge, shi, bai, sum;//个位十位百位；sum是各位立方之和
		for (int number = 100; number <= 999; number++) {
			bai = number / 100;
			shi = (number - bai * 100) / 10 ;
			ge = number - (bai * 100) - (shi * 10);
			sum = (int) Math.pow(bai, 3) + (int) Math.pow(shi, 3) + (int) Math.pow(ge, 3);
			if (sum == number) {System.out.print(number + " ");}
		}
	}
}