package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//조건문 연습문제 2
		/*  내가 한거
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		
		int time = sc.nextInt();
		
		int pay = time * 10000;
		int pay1 = time * 10000 + (time - 8) * 5000;
		
		if (time<=8) {
			System.out.println("임금은 " + pay + "원 입니다.");
		} else {
			System.out.println("임금은 " + pay1 + "원 입니다.");
		}
		sc.close();
		*/
		
		//선생님이 한거
		int sum;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간 : ");

		int time = sc.nextInt();
		
		

		if (time > 8) {
			sum = 8 * 10000 + (time - 8) * ((int)(10000 * 1.5)); // 1.5 ---> 실수를 정수로 변환함(강제형변환)			
			System.out.println("임금은 " + sum + "원 입니다.");
		} else {
			sum = time * 10000;			
			System.out.println("임금은 " + sum + "원 입니다.");
		}
		sc.close();
	}

}
