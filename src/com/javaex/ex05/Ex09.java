package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		// 배열 같음 판단 알고리즘
		
		
		
		int[] arrA = new int[3];
		arrA[0] = 50;
		arrA[1] = 20;
		arrA[2] = 70;
		
		
		int[] arrB = new int[3];
		arrB[0] = 10;
		arrB[1] = 70;
		arrB[2] = 310;
		//arrB[3] = 40;

		// 배열A  배열B 같은지 판단 ---> 같다 라는건 정의해야함. 배열의 갯수가 같아야 한다.
		//						   값과 순서가 같아야 한다.   ==  같다 라는 정의.
		
		
		if (arrA.length == arrB.length) { //A와 B의 갯수가 같냐고 비교. 
			//첫번째 부터 값 비교
			
			for(int i = 0; i < arrA.length; i++) {
				if (arrA[i] != arrB[i]) {
					System.out.println(i + "번째 값이 다릅니다.");
				}
			}					
		} else { //A와 B의 갯수가 같냐고 비교했을때 배열의 크기가 다를 경우
			System.out.println("배열의 크기가 다릅니다.");
		}
		
		
		
		System.out.println("====A,B값 제대로 나오는지 확인=====");		
		System.out.println("-------------A값-----------");
		
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("");
		System.out.println("-------------B값-----------");
		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		
		
	}

}
