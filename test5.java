package test1;
import java.util.*;
import java.math.*;

public class test5 {	
	public static void main(String[] args) {
		long rabbit[] = new long [36];
		rabbit [0] = rabbit [1] = 1;
		System.out.println("��1����������1�ԣ�����2ֻ��");
		System.out.println("��2����������1�ԣ�����2ֻ��");
		for (int i=2; i < rabbit.length; i++) {
			rabbit [i] = rabbit [i - 1] + rabbit [i - 2];
			System.out.println("��" + (i + 1) + "����������" + rabbit [i] + "ֻ������" + (2 * rabbit[i]) + "ֻ��");
		}
	}
}