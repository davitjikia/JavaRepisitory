package com.syntax.class06;

import java.util.Scanner;

public class WorkHome7 {

	public static void main(String[] args) {
		
		Scanner scan;
		String name;
		String carOrigin=null;
		
		scan=new Scanner (System.in);
		
		System.out.println("Please enter your favorite car make");
		
		name=scan.next();
		
		switch (name) {
		case "BMW":
			carOrigin="german car";
			break;
		case "Toyota":
			carOrigin="japanese car";
			break;
		case "Maserati":
			carOrigin="italian car";
			break;
		default:
			System.out.println("unknown");
		}
		
		if(carOrigin!=null) {
			System.out.println("Your favorite car is "+carOrigin);
		}
	}
}
