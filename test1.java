package test1;
import java.util.*;
import java.math.*;

public class test1 {	
	public static void main(String[] args) {
		int count = 0;//��¼���ӵĸ���
		int sushu = 0;//��¼�����ĸ���
		int yushu = 0;//��¼����
		int i, j;//i��101-200֮�������j�ǳ���
		for (i = 101; i <=200; i++) {
			for (j = 1; j <= i; j++) {
				yushu = i % j;
				if (yushu == 0) {count += 1;}
				}
			if (count == 2) {
				System.out.print(i + " , ");
				sushu += 1;
				}
			count = 0;
		}
		System.out.println("��������" + sushu + "����");
	}
}