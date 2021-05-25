package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {
		
		//실수형 기본 사용방법
		double var01 = 3.14 ;
		float var02 = 3.14f ; //float는 long처럼 뒤에 f 붙여야함(대소문자 상관없음)
		
		System.out.println(var01);
		System.out.println(var02);
		
		//double  float의 값 정확도 표현비교
		double var03 = 0.1234567890123456789 ;
		float var04 = 0.1234567890123456789f ;
		
		System.out.println(var03);
		System.out.println(var04);
	}
}
