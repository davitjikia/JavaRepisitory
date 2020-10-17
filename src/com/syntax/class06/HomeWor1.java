package com.syntax.class06;

import java.util.Scanner;

public class HomeWor1 {

	public static void main(String[] args) {
		
	 Scanner scan=new Scanner(System.in);
	 
	 int num1, num2;
	 int result = 0;
	 char symbol;
	 System.out.println("Enter number1");
	 num1=scan.nextInt();
	 System.out.println("Enter number2");
	 num2=scan.nextInt();
	 System.out.println("Enter operator");
	 symbol=scan.next().charAt(0);
	 
	 if((num1==0 || num2==0) && symbol=='/') {
		 System.out.println("cant devide zero");
	 }else {
	 
	 switch (symbol) {
	 case '+':
		 result=num1+num2;
		 break;
	 case'-':
		 result=num1-num2;
		 break;
	 case'*':
		 result=num1*num2;
		 break;
	 case '/':
		 result=num1/num2;
		 break;
		 default:
			 System.out.println("ivalid operation");
			 
	 }
	 System.out.println("Result is "+result);
	 }
	
	}

}
