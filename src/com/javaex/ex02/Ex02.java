package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//int myAge = 25;
		Scanner sc = new Scanner(System.in);  // System.in---> 키보드 라는 뜻
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("입력하신 숫자는 " +  num  + " 입니다.");
		
		sc.close();
	}

}
