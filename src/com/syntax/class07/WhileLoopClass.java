package com.syntax.class07;

public class WhileLoopClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean workDay=true;
		
		int day=2;
		
		while (workDay) {
			
			if (day<6) {
			System.out.println("I need a day off");
			
		} else {
			System.out.println("dont need a break");
			workDay=false; // to stup infinite
			
		}

			day++;
	}
		
		
		
		
		
	}
}



