package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		/*
		 //방법1
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.println("숫자를 입력하세요.[0]이면 종료");
				
			num = sc.nextInt();
			sum = num + sum;
			System.out.println("합계 : " + sum);
			
			//반복시작
		  while (num != 0);{
		  
			//더하기 코드
			num = sc.nextInt();
			sum = num + sum;
			System.out.println("합계 : " + sum);
		}
		//반복 끝
		System.out.println("종료");
		
		sc.close();
		*/
		
		
		
		
		/*
		//do-while 방법
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.[0]이면 종료");
		
		do {
			num = sc.nextInt();
			sum = num + sum;
			System.out.println("합계 : " + sum);
		} while(num !=0);
		
		
		
		System.out.println("종료");
		
		sc.close();
		*/
		
		
		//while 방법3
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.[0]이면 종료");
		
		while (true) {
			num = sc.nextInt(); 					// 숫자를 받음.
			sum = sum + num;   						// 이전의 sum 값에 num값을 더함.(누적)
			System.out.println("합계 : " + sum);
			
			if(num == 0) {
				
				break;
			}
		}
			
		
		System.out.println("종료");
		
		sc.close();
	}

}
