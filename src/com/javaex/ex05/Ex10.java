package com.javaex.ex05;

//javaC Ex10.java-->Ex10.class
//java Ex10-->이거 가지고 프로그램이 실행

//java -version, java -help  --> 뭐가 오느냐에 따라서 프로그램이 달라짐.
public class Ex10 {

	public static void main(String[] args) { 
		// 배열이 기본 자료형이 아닐경우(String)
		// 변수 관리 편하기 때문에 배열 사용
		
		
		char[] arryC = new char[3];
		
		arryC[0] = '정';  //3을 넣을경우 문자(코드)3으로 인식."정우성",'정우성'도 마찬가지.""안되고 ''안에 한글자만 가능
		arryC[1] = '이';
		arryC[2] = '유';
		
		System.out.println("====char 출력확인====");
		
		for (int i = 0; i < arryC.length; i++) {
			System.out.println(arryC[i]);
		}
		
		System.out.println("");
		System.out.println("====Staring 출력확인====");
		String[] arryS = new String[3];

		arryS[0] = "정우성";	//String 이기 때문에 "" 사용하며 문자 출력 가능.
		arryS[1] = "이효리";
		arryS[2] = "유재석";
		
		for (int i = 0; i < arryS.length; i++) {
			System.out.println(arryS[i]);
		}
	}

}
