package com.assignments;

import java.util.Scanner;

class Sum{
	Sum(){//default constructor
		
	}
	public int add(int a, int b) {//add method created
		int c = a+b;//add logic
		return c;
	}
}
public class Test {

	public static void main(String[] args) {
//		int a;//declaration
//		a = 5;//initialization
//		int b;
//		b = 10;
//		int c = a+b;
//		System.out.println(c);
		
//		int a = 5;//declaration & initialization in same line
//		int b = 10;
//		int c = a+b;
//		System.out.println(c);
		
//		String var = "The sum of the values you have entered is: ";
//		Sum s = new Sum();//Sum object created
//		int result = s.add(5, 10);//calling add method
//		System.out.println(var+result);
		
		Scanner sc = new Scanner(System.in);//Scanner class object created
		System.out.println("Enter 1st number: ");
		int p1 = sc.nextInt();//helps to take user input from console
		System.out.println("Enter 2nd number: ");
		int p2 = sc.nextInt();
	
		Sum s = new Sum();
		int r = s.add(p1, p2);
		System.out.println("The sum of the values you have entered is: "+r);
	}

}
