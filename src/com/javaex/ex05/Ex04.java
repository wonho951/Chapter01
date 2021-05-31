package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		//방 갯수 변경될때. for문에서 개수 부분을 변경해줘야 함.
		
		int[] no = new int[80];  // 갯수 6--->8  
		
		//수동으로 해야한다. (운이 좋아서 할 수 있는 상황)
		for (int i = 0; i < no.length; i++) {
		no[i] = (int)(Math.random()*45)+1;  
		}
		
		System.out.println(no.length);     // length  -->   방 갯수를 알려줌.
		System.out.println("====================");
				
		for (int i = 0; i < no.length; i++) {  //length  -->   방 갯수를 알려줌. 
		System.out.println(no[i]);       
		}
		
		System.out.println("====================");
		
		
		for (int i = 0; i < no.length; i++) {   //i<6을 못고칠 경우 오류남.     
			System.out.println(no[i]);          // 미리 length 사용할 경우 일일히 안고쳐도 됨.
			}
	}

}
