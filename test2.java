package test1;
import java.util.*;
import java.math.*;

public class test2 {	
	public static void main(String[] args) {  
		 int yushu;
		 int count = 0;//记录因数个数
		 int sushu = 0;//记录素数个数
		 int i, j;
		 for (i = 101; i <= 200; i++) {
			 for (j = 1; j <= i; j++) {
				 yushu = i % j;
				 if (yushu == 0) {count += 1;}
			 }
			 if (count == 2) {System.out.print(i + " "); sushu += 1;}
			 count = 0;
		 }
		 System.out.println("共有素数" + sushu + "个。");
	}  
}  