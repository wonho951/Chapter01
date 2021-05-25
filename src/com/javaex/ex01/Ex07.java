package com.javaex.ex01;

public class Ex07 {
	public static void main(String[]args) {
		
		//형변환 연습문제
		double v01 = 5/4;            // int= int / int  5,4가 int이기 때문에 int로 표현
		System.out.println(v01);     // 결과 int ---> double로 형변환 시킨거임.
		
		double v02 = (double)5/4;    // 5가 5.0으로 강제 형변환 됨.  실수/정수이기 때문에 실수가 이기므로 1.25출력됨
		System.out.println(v02);      
		
		double v03 = 5/ (double)4;   // 4가 4.0으로 강제 형변환 되므로 1.25로 출력됨.양쪽을 실수로 맞춤. 
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4; //5,4 둘다 강제 형변환시켜 5.0, 4.0이므로 1.25로 출력
		System.out.println(v04); 
		
		int v05 = (int)1.3 + (int) 1.8; // int로 강제 형변환시켰으므로 소수점빼고 계산됨.
		System.out.println(v05);
		
		
		int v06 =(int) (1.3 + 1.8); // 먼저 더하고 강제로 int로 바꿈. 소수점은 버렸으니 3으로 출력
		System.out.println(v06); 

		
	}
}
