package test1;
import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;

public class test16 {	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in); 
		 System.out.println("Please input several numbers, split with space: ");
	     String s = in.nextLine();//将用户输入的一整行字符串赋给s  
	     String[] c = s.split("\\ ");//用空格将其分割成字符串数组   
	     int [] b =new int[c.length];  
	     
	     for (int m = 0; m < b.length; m++) {  
	         b[m] = Integer.parseInt(c[m]);//将字符串数组转换成int数组  
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