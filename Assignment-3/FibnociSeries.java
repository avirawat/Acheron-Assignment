// 11. fibonacci series

package com.shristi.training;
import java.util.Scanner;
public class FibnociSeries {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int firstTerm = 0, secondTerm = 1;
	System.out.println("Fibonacci Series till " + n + " terms:");

	 for (int i = 1; i <= n; ++i) {
	    System.out.print(firstTerm + " ");
	    int nextTerm = firstTerm + secondTerm;
	    firstTerm = secondTerm;
	    secondTerm = nextTerm;
	    }
	 sc.close();
	}

}