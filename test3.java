package test1;
import java.util.*;
import java.math.*;

public class test3 {	
	public static void main(String[] args) {  
		 int input;
		 Scanner a = new Scanner(System.in);
		 System.out.println("请输入一个数字： ");
		 input = a.nextInt();
		 new Fenjie(input);
	}
}  
class Fenjie {
	int m = 2;
	public Fenjie(int a) {
		if (a <= 1) {System.out.println("输入数字无法分解。");}
		if (a == 2) {System.out.println(a + "可被分解为1*2.");}
		else {
			System.out.print(a + " = 1");
			while (m <= a) {
				if (a % m == 0) {System.out.print(" * " + m); a = a/m;}
				else {m++;}
			}
		}
	}
}
