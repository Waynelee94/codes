package test1;
import java.util.*;
import java.math.*;

public class test2 {	
	public static void main(String[] args) {  
		 int i,j,n,m,x;      //n�������洢�����ģ�m������ͳ�ƾ���һ���������ӣ�  
		    n=0;m=0;x=0;        //x������ͳ��101~200֮ǰ�����ĸ���  
		    for(i=101;i<=200;i++){             //����ѭ��  
		        for(j=1;j<=i;j++){         
		            n=i%j;                    //ȥ�������������Ϊ�㣬���Ǹ���������  
		            if(n==0)  { m=m+1; }      //ͳ��ĳ���ж��ٸ�����  
		            }   
		     if(m==2){System.out.print(i+" "); x=x+1;} //���ĳ��������ֻ��������������һ�������������������Ӧ�����  
		          m=0;            //һ��Ҫ���㣬��Ȼ������ۼ�  
		        }  
		       System.out.println();  
		       System.out.println("��101~200֮�gһ�����ؔ���"+x+"��");  
		        }  
		   }  