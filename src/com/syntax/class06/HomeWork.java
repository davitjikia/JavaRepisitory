package com.syntax.class06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String Country;
		String lang=null;
		System.out.println("Enter your country");
		Country = scan.nextLine();

		switch (Country) {
		case "Georgia":
			lang = "Georgian";
			break;
		case ("Usa"):
			lang = "English";
			break;
		case ("Italy"):
			lang = "Italian";
			break;
		case ("Spain"):
			lang="Spanish";
		break;
		default:
			System.out.println("invalid");
 
 }if(lang!=null) {
		System.out.println("people in youe coubtnry speaks "+lang);
}
}
}