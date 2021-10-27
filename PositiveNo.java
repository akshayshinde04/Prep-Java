package com.pre;
import java.util.Scanner;

public class PositiveNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		
		int num = sc.nextInt();
		if(num == 0)
			System.out.println("Number is Zero");
		else if (num > 0)
			System.out.println("Number is Positive ");
		else
			System.out.println("Number is Negative ");
		sc.close();
		
	}
}
