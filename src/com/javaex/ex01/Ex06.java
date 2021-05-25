package com.javaex.ex01;

public class Ex06 {
	public static void main(String[]agrs) {
		
		//자동형변환 예제1 : 자료 형변환 규칙을 알아야 잘료형을 결정할 수 있다.
		System.out.println(2+3.5);
		double var01 = 2 + 3.5;//자료형을 알아야 한다.
		System.out.println(var01);
		
		//자동형변환 예제2 : (long + float)
		long var02 = 12345L; //int범위를 넘어가면 L을 붙여야 한다. 대개로 헷갈리니 long형을 사용할땐 L을 붙이는게 좋다.
		float var03 = 1.1f; // 세부규칙 : 무조건 f 붙여야함. 까먹 ㄴㄴ
		
		System.out.println(var02+var03); // test ----> 실수 (float)로 출력
		
		float result01 = var02 + var03; // long ---> float로 변환되었음(자동)
		
		System.out.println(result01);
				
		
		System.out.println("-----------------------------");
		
		
		//강제형변환
		int var04 = (int)3.14;     //소수점 사라짐. (실수를 int 형으로 강제로 바꿈)
		System.out.println(var04);
		
		
		//확대변환(강제 형변환)
		byte var05 = 127;
		int result02 = (int) var05; //byte에서 int로 강제 형변환
		System.out.println(result02);
		
		//축소변환(강제 형변환)
		int var06 =10;
		byte result03 = (byte)var06;
		System.out.println(result03);
		
		//축소변환 위랑 비교
		int var07 = 1030222;
		byte result04 = (byte)var07;
		System.out.println(result04);  //출력되는값 이유 확인. 메모리의 앞부터 지워버리기 때문에 엉뚱한 값 출력. 사용시 주의요망.
		
		
		//실수--->정수 : 소수점 없어짐
		double var08 = 5.57;
		int result05 = (int) var08;
		System.out.println(result05);
		
		
		//정수 ----> 실수 : 소수점이 0으로 표현됨 
		int var09 = 7;
		double result06 = (double)var09;
		System.out.println(result06);
		
		
	
		
	}

}
