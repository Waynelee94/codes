package test1;
import java.util.*;
import java.math.*;

public class test8 {	
	public static void main(String[] args) {
		System.out.println("2-1000之间的完数有： ");
		Fun();
	}
	public static void Fun() {  
		  
        for (int i = 1; i <= 1000; i++) {  
  
            int temp = 0;// 定义因子之和变量  
  
            for (int n = 1; n < i / 2 + 1; n++) {  
                if (i % n == 0) {  
                    temp += n;// 能被整除的除数则被加到temp中  
                }  
            }  
            if (temp == i) {// 如果因子之和与原数相等的话，说明是完数  
                System.out.print(i + " ");// 输出完数  
            }  
        }  
    }  
}  