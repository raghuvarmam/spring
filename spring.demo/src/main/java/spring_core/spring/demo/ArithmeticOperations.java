package spring_core.spring.demo;

import java.util.Scanner;

public class ArithmeticOperations {
	//public static int a=6,b=2;
	Scanner sc= new Scanner(System.in);
	public  int add(){
		System.out.println("enter the first value for addition");
		int a=sc.nextInt();
		System.out.println("enter the second value for addition");
		int b=sc.nextInt();
		return a+b;
	}
	
	public int sub(){
		System.out.println("enter the first value for subtraction");
		int a=sc.nextInt();
		System.out.println("enter the second value for subtraction");
		int b=sc.nextInt();
		return a-b;
	}

}
