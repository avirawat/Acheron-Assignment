// 7.  factorial for a number
package com.shristi.training;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.print("Factorial is "+fact);
		sc.close();
	}
}
