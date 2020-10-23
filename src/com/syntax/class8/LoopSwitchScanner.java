package com.syntax.class8;

import java.util.Scanner;

public class LoopSwitchScanner {

	public static void main(String[] args) {
	
	
				// TODO Auto-generated method stub
				double num1;
				double num2;
				char operation;
				double results;
				boolean continueLoop=true;
				String end;
				
				while(continueLoop) {
				System.out.println("Please Enter two numbers");
				Scanner scanner = new Scanner(System.in);
				num1 = scanner.nextDouble();
				num2 = scanner.nextDouble();
				System.out.println("Please Enter the operation + - * /");
				operation = scanner.next().charAt(0);
				
				if (!(operation=='+' || operation=='-' || operation=='*' || operation=='/' )) {
					System.out.println("operation not suported");
					continue;       // this is good case!
					
				}
				
				switch (operation) {
				case '+':
					results = num1 + num2;
					break;
				case '-':
					results = num1 - num2;
					break;
				case '*':
					results = num1 * num2;
					break;
				case '/':
					results = num1 / num2;
					break;
				default:
					results = 0;
				}
				System.out.println("Results are " + results);
				System.out.println("Enter Yes to perform more operations and No to terminate the program");
				end=scanner.next();
				if("No".equals(end)) {
					continueLoop=false;
				}
				}
			}
		
	}


