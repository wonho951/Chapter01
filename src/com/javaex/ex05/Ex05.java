package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		//배열 세부문법
		/*      정석 표기법
		int[] intArray = new int[3];
		
		intArray[0]=11;
		intArray[1]=3;
		intArray[2]=78;
		
		for (int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
		// 줄여서 쓰는 표기법.[] 안에 주의할것.
		int[] intArray = new int[] {11, 3, 78}; //방 갯수를 안줘도 됨. 값이 추가되거나 빠질때마다 알아서 적용됨.
		
		
		for (int i = 0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
