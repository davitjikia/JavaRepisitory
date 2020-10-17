package com.syntax.class06;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		
			
			   Scanner scan=new Scanner (System.in);
			   int num;
			   String message=null;
			   
			  System.out.println("enter the roll number of the child");
			  num=scan.nextInt();
			  
			  switch (num){
			    case 101:
			       message="Ramesh";
			       break;
			    case 102:
			      message="Mahesh";
			      break;
			    case 103:
			      message="Mukesh";
			      break;
			    default:
			    System.out.println("Not found Student name: in Class");
			    
			  }
			  if(message!=null) {
			    System.out.println("Student name: "+message);
			  }
			 }
			}
	


