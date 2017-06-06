package test1;
import java.util.*;
import java.math.*;
import java.text.*;

public class test14 {	
	public static void main(String[] args) {
		int x, y;
		for (x = 1; x <= 9; x++) {
			for (y = 1; y <= x; y++) {
				System.out.print(y + "*" + x + "=" + x * y + " ");
			}
			System.out.println();
		}
	}
}  