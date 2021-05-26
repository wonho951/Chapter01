package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
			
		/*
		 // 짝수 홀수 음수 출력 문제	
		Scanner sc = new Scanner(System.in);
				
				
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		int num = sc.nextInt();
				
		if (num % 2 == 0 && num > 0) {  
			System.out.println("짝수입니다.");			
		} else if (num % 2 == 1) {
			System.out.println("홀수입니다.");	
		} else if (num < 0) {
			System.out.println("음수입니다.");	
		} else if (num == 0 ) {
			System.out.println("0입니다.");	
		}
		
		sc.close();
        */
		
	
		/*
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		int num = sc.nextInt();
				
		if (num % 2 == 0 && num > 0) {  
			System.out.println("짝수입니다.");			
		} else if (num % 2 == 1) {
			System.out.println("홀수입니다.");	
		} else if (num < 0) {
			System.out.println("음수입니다.");	
		} else {
			System.out.println("0입니다.");	
		}
		
		sc.close();
		*/
		
		
		//중복 if문 선생님이 하신거.
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		
		int num = sc.nextInt();
		/*		
		if (num > 0) {         
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}				
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");	
		}
		*/
		
		
		//다른 방법
		if (num > 0 && num % 2 ==0) {                //이중으로 질문된건 위에 방법처럼 하는것도 있음.
			System.out.println("짝수입니다.");
		}else if(num > 0 && num % 2 != 0) {
			System.out.println("홀수입니다.");
		}else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");	
		}
		
		sc.close();
		
	}

}
