package com.javaex.ex01;

public class Ex08 {

	public static void main (String[] args) {
		
		
		//연산자
		//대입연산자
		System.out.println("대입연산자----------");
		int a = 7;		     
		int b = 2;
		     // ← 방향   숫자를 a,b에 대입.
		System.out.println(a);
		System.out.println(b);
		
		//산술연산자
		System.out.println("산술연산자----------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //자료형에 따라 값이 달라질수 있음 (double 사용시 소수점까지 표현)
		System.out.println(a%b); //나눴을때 남는 나머지만 표기, 몫은 표기안함
		
		//산술연산자  /(나누기) %(나머지)
		System.out.println("산술연산자  /  %  자세히-------------");
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0);
		
		//부호 연산자
		System.out.println("부호연산자-------------");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		var = -var;
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		System.out.println(var);
		
		
		//증감 연산자
		System.out.println("증감연산자 앞-------------");
		System.out.println(a); /// a --> 7
		System.out.println(++a); //a의 값 자체를 증가시킨후 고정 
		System.out.println(a); // a의 값은 변했을까를 알아보기 ---> 변함
		
		System.out.println(b); /// b=2
		System.out.println(--b); // b의 값 자체를 증가시킨 후 고정
		System.out.println(b);// b의 값은 변했을까를 알아보기 ---> 변함
		
		System.out.println("증감연산자 뒤-------------");
		System.out.println(a); // a --> 8		
		System.out.println(a++); // 출력 먼저 하기 때문에 a의 값은 8로 출력. 후에 a출력시 +1 된 상태로 출력됨.
		System.out.println(a); // a --> 9 위에 a++ 명령이 이제 실행됨
		
		
		System.out.println(b); // b --> 1
		System.out.println(b--); // 출력 먼저 하기 때문에 b의 값은 1로 출력. 후에 b출력시 -1 된 상태로 출력됨.
		System.out.println(b); // b --> 0 위에 b-- 명령이 이제 실행됨
	
		
		
		System.out.println("증감연산자 연습문제-------------");
		int num = 5;
		System.out.println(num); //num --> 5
		
		/*
		//System.out.println(++num); //num:5 --> 6 이후에 출력
		System.out.println(num++); //출력 , num: 5 --> 6    --> 이 순서이기 때문에 출력시 5로 출력됨.
		System.out.println(num);  // 위에서 num 값을 6으로 바꿔줬기 때문에 이제서야 6으로 출력됨.
		*/
		System.out.println(num++ +5*10-7); //출력전 *10 먼저 한 후 출력 그 이후 ++적용(결과 50)으로 출력됨.
		System.out.println(num);
		System.out.println(num *10);
	}
	
}
