package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		// 배열 부등호 주의(고의 오류 내보는 상황)
		
		int[] intArray = new int[3];
		
		intArray[0]=11;
		intArray[1]=3;
		//intArray[2]=78;      // 값을 안넣을 시 정수형은 0으로 초기화됨.(주석처리해서 값을 넣지 않은 경우 표현.)
		                       // 실수형, boolean형, char 기본값으로 세팅됨. 확인해보면 좋을듯.
		
		System.out.println("===================");
		System.out.println(intArray.length);
		System.out.println("===================");
		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("===================");
		
		//ArrayIndexOutOfBoundsException--->없는 방번호 사용하려고 할때 오류출력(부등호때문에)
		for (int i = 0; i <= intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
		
		//배열의 복사.(실제값 복사)
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = new int[3];
		
		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];   // arrA의 값을 arrB에 대입.
		}
		
		
		System.out.println("arrA[]");  //대입 과정이 끝난후 arrA[]라는 문자 출력		
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("i=" + arrA[i]); // arrA의 값인 3, 6, 9 출력
		}
		
		
		System.out.println("arrB[]");
		for(int i = 0; i < arrB.length; i++) {
			System.out.println("i=" + arrB[i]); // 위에서 arrA의 값을 arrB에 대입시켰으므로 arrB의 값은 arrA의 값으로 출력됨.
		}
		

	}

}
