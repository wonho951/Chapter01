package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		
		
		int num = 1;
		
		while (true) {
			
			if(num % 6 == 0 && num % 14==0) {
				System.out.println(num);
				break;
			} 
			num++;
			
		}

	}

}
