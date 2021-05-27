package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			
		
		while (true) { // boolean action = true  (t 자리에 action 넣음)
			
		System.out.println("숫자를 입력하세요");		
		int num = sc.nextInt();
			if(num==0) {
				System.out.println("종료");	
				break;                      //다른건 그 외에 경우니 브렉끼 여기에 거는거?맞나..
			}
			
			
			if(num%3!=0) {
				System.out.println("3의 배수가 아닙니다.");
			}else {
				System.out.println("3의 배수 입니다.");				
			}			
		}	
		
		sc.close();

	}

}
