package test1;
import java.util.*;
import java.math.*;

public class test5 {	
	public static void main(String[] args) {
		long rabbit[] = new long [36];
		rabbit [0] = rabbit [1] = 1;
		System.out.println("第1个月有兔子1对，共计2只。");
		System.out.println("第2个月有兔子1对，共计2只。");
		for (int i=2; i < rabbit.length; i++) {
			rabbit [i] = rabbit [i - 1] + rabbit [i - 2];
			System.out.println("第" + (i + 1) + "个月有兔子" + rabbit [i] + "只，共计" + (2 * rabbit[i]) + "只。");
		}
	}
}