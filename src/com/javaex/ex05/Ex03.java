package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		
		//방 갯수 주의 할것.
		int[] no = new int[6];  
		
		
		for (int i = 0; i < 6; i++) {
		no[i] = (int)(Math.random()*45)+1;  
		}
		
		
		for (int i = 0; i <= 6; i++) { // 1< 6       1<=6--->에러남. 방은 5개인데 6번째까지 찾으라해서 뇌절함.
		System.out.println(no[i]);       
		}
		 

	}

}
