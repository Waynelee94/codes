package test1;
import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;

public class test16 {	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in); 
		 System.out.println("Please input several numbers, split with space: ");
	     String s = in.nextLine();//���û������һ�����ַ�������s  
	     String[] c = s.split("\\ ");//�ÿո���ָ���ַ�������   
	     int [] b =new int[c.length];  
	     
	     for (int m = 0; m < b.length; m++) {  
	         b[m] = Integer.parseInt(c[m]);//���ַ�������ת����int����  
	     }  
	     
	     int temp = 0;  
	     for (int i = 0; i < b.length; i++) {  
	         for (int j = 0; j < b.length - i - 1; j++) {  
	             if(b[j] > b[j + 1]) {  
	                 temp = b[j];  
	                 b[j] = b[j + 1];  
	                 b[j + 1] = temp;  
	             }  
	         }  
	     }    
	     for(int n = 0; n < b.length; n++) {  
	         System.out.print(b[n] + " ");   
	     }   
	 }  
}  