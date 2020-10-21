package com.syntax.class8;

public class NestedLoop1 {

	public static void main(String[] args) {
		for (int a = 1; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				System.out.println(a + "" + b);
			}
		}
		System.out.println("-----how can i print clock----------------------");

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if(m<10) {
					System.out.println(h + ":0" + m);
				}else {
				System.out.println(h + ":" + m);
			}

		}

	}

}}