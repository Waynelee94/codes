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
		double sum = 0;//��·��
		double height = 100;
		for (int i = 1; i <= bounce ; i++) {
			double distance = 0;//һ�ε����·��
			distance = height + height / 2;
			sum += distance;
			System.out.println("��" + (int) i + "�ε���ʱ����ʼ�߶�Ϊ��" + height +" ����߶�Ϊ��" + height / 2 + 
					" �˴ε��𾭹�·��Ϊ��" + distance + ", ��·��Ϊ:" + sum);
			height = height / 2;
		}
	}
}  