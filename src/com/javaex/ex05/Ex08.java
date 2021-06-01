package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		// 배열복사(실제값 복사)
		// int numA = 3;   int numB = numA;  이거랑 같은지 확인해보기. 
		
		System.out.println("A값을 선언 후 B값에 복사하면 B값은 A의 값을 복사해오지만 그 후에 A값만 변경했을시에 B값에는 변화가 없음.\n ---> B값 선언시에 방크기는 A보다 크게 줘도 A의 값을 넘어가는 방크기의 값은 복사할수 없으므로 출력되지 않음.");
		System.out.println("");
		
		
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		
		System.out.println("////A값 선언후 A값 확인////");
		
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("arrA값 = " + arrA[i]);
			//arrB[i] = arrA[i];
		}
		
		System.out.println("");
		System.out.println("======A값을 B값에 복사(실제값)한 후 확인==========");
		
		int[] arrB = new int[3]; // int[] arrB = arrA; --> 비교해보기
								// 선언시에 [] 안의 값을 arrA랑 맞추지 않아도 arrA의 값만 적용 그외에는 기본값(0)적용.
								// ex) int[] arrB = new int[3]; --> 3이 아닌 4이상의 값을 넣어도 
								// 복사되는건 실제 값인 3,6,9만 복사되고 나머지는 출력되지 않음.(실험 완료)
		
		for(int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		//arrA출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("arrA값 = " + arrA[i]);
			
		}
		
		System.out.println("--------------------------");
		
		//arrB출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("arrB값 = " + arrB[i]);		
		}
		
		System.out.println("");
		System.out.println("======A값만 변경 후 A,B값 확인==========");
		
		//arrA[1] : 6-->100으로 변경     arrA만 변경되고 arrB는 변경 안되는거 확인
		
		arrA[1] = 100;									// arrA[1]의 값만 바꿨을때 arrA[1]의 값만 바뀜
		
		
		//arrA출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("arrA값 = " + arrA[i]);
		}
		
		System.out.println("--------------------------");
		
		
		//arrB출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println("arrB값 = " + arrB[i]);		
		}
		
	}

}
