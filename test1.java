package test1;
import java.util.*;
import java.math.*;

public class test1 {	
	public static void main(String[] args) {
		int ge, shi, bai, sum;//��λʮλ��λ��sum�Ǹ�λ����֮��
		for (int number = 100; number <= 999; number++) {
			bai = number / 100;
			shi = (number - bai * 100) / 10 ;
			ge = number - (bai * 100) - (shi * 10);
			sum = (int) Math.pow(bai, 3) + (int) Math.pow(shi, 3) + (int) Math.pow(ge, 3);
			if (sum == number) {System.out.print(number + " ");}
		}
	}
}