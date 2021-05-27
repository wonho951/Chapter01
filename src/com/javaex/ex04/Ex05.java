package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int dan = 2; dan <= 9; dan++) { //int dan = 2; dan <= 9; dan++
			for (int i = 1; i<=9; i++) {     //int i = 0; i<=9; i++
				sum = dan *i;				
				System.out.println(dan + " * " + i + " = " + sum );				
			}			
			System.out.println("===========");
		}

	}

}
