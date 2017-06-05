package test1;
import java.util.*;
import java.math.*;

public class test11 {	
	public static void main(String[] args) {
		int profit;
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the profit of this month: ");
		profit = in.nextInt();
		Fun(profit);
	}
	public static void Fun(int profit) {
		double bonus;
		if (profit <= 100000) {
			bonus = profit * 0.1;
		}
		else if (profit <= 200000) {
			bonus = 10000 + (profit - 100000) * 0.075 ;
		}
		else if (profit <= 400000) {
			bonus = 10000 + 7500 + (profit - 200000) * 0.05 ;
		}
		else if (profit <= 600000) {
			bonus = 10000 + 7500 + 10000 + (profit - 400000) * 0.03;
		}
		else if (profit <= 1000000) {
			bonus = 10000 + 7500 + 10000 + 6000 + (profit - 600000) * 0.015;
		}
		else {
			bonus = 10000 + 7500 + 10000 + 6000 + 6000 + (profit - 1000000) * 0.01;
		}
		System.out.println("当月利润为：" + profit + ", 可得奖金：" + bonus);
	}
}  