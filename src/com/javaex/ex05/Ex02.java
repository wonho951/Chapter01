package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		
		//배열 - 참조자료형
		
		int[] no = new int[6];  // 처음 선언할 때 []안에 내용은 방의 총 갯수임.
								// 처음 []는 비워둠.
		
		/*
		no[0] = (int)(Math.random()*45)+1;    //0부터 시작임. (헷갈리지 말기) 
		no[1] = (int)(Math.random()*45)+1;
		no[2] = (int)(Math.random()*45)+1;
		no[3] = (int)(Math.random()*45)+1;
		no[4] = (int)(Math.random()*45)+1;
		no[5] = (int)(Math.random()*45)+1;
		*/
		
		for (int i = 0; i < 6; i++) {
			no[i] = (int)(Math.random()*45)+1;  // 각 방마다 굳이 선언 안하고 반복문으로 설정 가능.
		}
		/*
		System.out.println(no[0]);
		System.out.println(no[1]);
		System.out.println(no[2]);
		System.out.println(no[3]);
		System.out.println(no[4]);
		System.out.println(no[5]);		
		*/
		
		for (int i = 0; i < 6; i++) {
			System.out.println(no[i]);       // i값이 반복적이니까 방번호대신 i값 넣어줌.
		}
		
		
	}

}
