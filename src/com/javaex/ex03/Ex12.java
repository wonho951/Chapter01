package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요");
		
		int month = sc.nextInt();
		
		
		//switch문의 규칙 찾아서 할수 있는법
		
		//4 6 9 11월 ---> 30일
		// 2         ---> 28일
		//나머지     ---> 31일
		switch (month) {
			
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일 입니다.");
				break;
			case 2:
				System.out.println("28일 입니다.");
				break;
			default:
				System.out.println("31일 입니다.");
				break;	
			
		}
		
		
		sc.close();
		

	}

}
