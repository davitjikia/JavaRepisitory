package com.syntax.class02;

import java.util.Scanner;

public class NewCompare {

	public static void main(String[] args) {
	 Scanner input;
	 int score;
	 int quiz;
	 int midterm;
	 input=new Scanner(System.in);
	 System.out.println("inputs of scores");
	 score=input.nextInt();
	 quiz=input.nextInt();
	 midterm=input.nextInt();
	 
	 double avarage=(score+quiz+midterm)/3;
	 
	 if(avarage>=90) {
		 System.out.println("grade==A");
	 }else if (avarage>=70 && avarage<90) {
		 System.out.println("grade=b");
	 }else if (avarage>=50 && avarage<70) {
		 System.out.println("grade=c");
	 }else if (avarage<50) {
		 System.out.println("grade=F");
	 }
	 
	 System.out.println("______________________ swori versia");
	}

}
