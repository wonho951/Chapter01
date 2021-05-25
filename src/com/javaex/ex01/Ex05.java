package com.javaex.ex01;

public class Ex05 {
	//pi값 변경 유무 실험
	public static void main(String[] args) {
		
		//일반적인 방식 
		double pi = 3.14 ;
		double result01 = 5*5*pi;		
		System.out.println(result01);
		
		
		//진짜 의도 : pi는 항상 3.14로 사용해야 한다. --> 위랑 비교했을때 변경되었음.
		pi = 3.1415926;
		double result02 = 5*5*pi;		
		System.out.println(result02);
		
		
		//상수로 정의한 경우
		final double PI = 3.14;
		double result03 = 5*5*PI;
		System.out.println(result03);
	    //final은 잘 쓰는게 어려움. 관례적으로 final을 사용하면 대문자로 사용
		
		/*
		PI = 3.1415926;
		double result04 = 5*5*PI;
		System.out.println(result04);      // pi값이 3.14로 고정되었기 때문에 에러남
		*/
		
	}	
	
}
