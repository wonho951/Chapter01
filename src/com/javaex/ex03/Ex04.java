package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		//조건문 연습문제 -1           내가 한거
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		
		int time = sc.nextInt();
		
		int pay = time * 10000;
		int pay1 = time*10000 + (time-8) * 2000;
		
		if (time<=8) {
			System.out.println("임금은 " + pay + "원 입니다.");
		}else {
			System.out.println("임금은 " + pay1 + "원 입니다.");
		}
		
		
		sc.close();
		*/
		
		//선생님이 한거
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		
		
		
		int hour = sc.nextInt();
		
		
		
		if (hour > 8) {
			int sum = 8*10000 + (hour-8) * 12000;
			System.out.println("임금은 " + sum + "원 입니다.");
		}else {
			int sum = hour * 10000;
			System.out.println("임금은 " + sum + "원 입니다.");
		}
		
		
		sc.close();

	}

}
