package test1;
import java.util.*;
import java.math.*;

public class test8 {	
	public static void main(String[] args) {
		System.out.println("2-1000֮��������У� ");
		Fun();
	}
	public static void Fun() {  
		  
        for (int i = 1; i <= 1000; i++) {  
  
            int temp = 0;// ��������֮�ͱ���  
  
            for (int n = 1; n < i / 2 + 1; n++) {  
                if (i % n == 0) {  
                    temp += n;// �ܱ������ĳ����򱻼ӵ�temp��  
                }  
            }  
            if (temp == i) {// �������֮����ԭ����ȵĻ���˵��������  
                System.out.print(i + " ");// �������  
            }  
        }  
    }  
}  