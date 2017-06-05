package test1;
import java.util.*;
import java.math.*;

public class test9 {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input how many times the ball bounces:");
		int bounce = in.nextInt();
		fun(bounce);
    }
	public static void fun(int bounce) {
		double sum = 0;//总路程
		double height = 100;
		for (int i = 1; i <= bounce ; i++) {
			double distance = 0;//一次掉落的路程
			distance = height + height / 2;
			sum += distance;
			System.out.println("第" + (int) i + "次掉落时，初始高度为：" + height +" 弹起高度为：" + height / 2 + 
					" 此次弹起经过路程为：" + distance + ", 总路程为:" + sum);
			height = height / 2;
		}
	}
}  