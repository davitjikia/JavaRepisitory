package com.syntax.class11;

public class HomeWork {

	public static void main(String[] args) {
	
		int [] [] number= {
				{67, 98, 81, 64},
				{75, 23, 34, 23},
				{54, 22, 56, 43}
				
		};
		int sum=0;
		for(int i=0; i<number.length; i++) {
			for (int j=0; j<number[i].length; j++) {
				if (!(i==0 || j==0)) {
					sum=sum+number[i][j];
					
				}
				
			}
			
		}
		    System.out.print(sum);
		    System.out.println("----------------------");
		    System.out.println("----------Second way------------");
		    
		    int [] [] numbers= {
					{67, 98, 81, 64},
					{75, 23, 34, 23},
					{54, 22, 56, 43}
		    };
					
       int sum1=0;
       
       for (int []  numb:numbers) {
    	   for (int num:numb) {
    		   if(num%2!=0) {
    			   sum1=sum1+num;
    		   }
    	   }
       }
       
       System.out.print(sum1);
	}
		    }
