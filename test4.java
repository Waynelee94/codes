package test1;
import java.util.*;
import java.math.*;

public class test4 {	
	public static void main(String[] args) {  
		int input;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("请输入成绩（输入999退出）：");
			input = in.nextInt();
			if (input == 999) {break;}
			else if (input < 60) {System.out.println("C");}
			else if (input >= 90) {System.out.println("A");}
			else if (input < 90) {System.out.println("B");}
			
		}
	}
}