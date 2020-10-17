package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		String name;
		
		String message=null;
		
		System.out.println("Enter name of instructor");
		
		name=scan.next();
		
		
		switch (name) {
		case "Asghar":
			message="Java";
			break;
		case "Moazam":
			message="SDCL";
			break;
		case "Weeqas":
			message="Selenium";
			break;
		case "Asel":
			message="every";
			break;
			default:
				System.out.println("Invalid insturctor");
				
		
		}
		if(message!=null) {
			System.out.println("Will take care of "+message+" Assighnment");
		}
		
	}

}
