package com.syntax.class8;

public class HomeWork11 {

	public static void main(String[] args) {
		
		for(int a=1; a<=4; a++) {
		      for(int b=1; b<=4; b++) {
		        if(b==1 || b==4 || a==1 || a==4) {
		          System.out.print("$");
		        }else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }

	}

}
