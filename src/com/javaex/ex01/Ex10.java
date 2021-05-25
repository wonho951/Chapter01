package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//논리 연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본(&&)
		System.out.println("&&연산자--------------");
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//논리 연산자 기본(||)
		System.out.println("||연산자--------------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		//논리 연산자 응용
		System.out.println("논리 연산자 응용--------------");
		System.out.println((a>b) && (a<b)); // (5>7)--->f  (5<7)--->t  f&&t  : 결과적으로 f
		System.out.println((a>b) && (a>b)); // (5>7)--->f  (5>7)--->f  f&&f  : 결과적으로 f
		System.out.println((a>b) || (a<b)); // (5>7)--->f  (5<7)--->t  f||t  : 결과적으로 t
		System.out.println((a>b) || (a<b) && (a<b)); // (5>7)--->f  (5<7)--->t  (5<7)--->t  : 결과적으로 t
		System.out.println((a>b) && (a<b) || (a<b)); // (5>7)--->f  (5<7)--->t  (5<7)--->t  : 결과적으로 t
		
		System.out.println((a>b) && (a<b) && (a<b)); // (5>7)--->f  (5<7)--->t  (5<7)--->t(개선하지 않음)  : 결과적으로 f0
		                                             // if문 할때 설명 ---> 모두 true 여야 true다  --> 모두 만족해야한다
		
		
		System.out.println("논리 연산자 !--------------");
		System.out.println(a<b); // 5<7 --> true 
		System.out.println(!(a<b)); // 5<7 --> true    !true ---> false
		
		System.out.println((a>b) && (a>b)); // 5>7 --> f   5>7 --> f  : 결과 f
		System.out.println( ! (  (a>b) && (a>b)  ) ); // 5>7 --> f   5>7 --> f  : !이 붙었으므로 f였지만 t로 바뀜 
		
		System.out.println((a>b) && (!(a>b))); // 5>7 --> f   5>7 --> f였지만 !때문에 t로 바뀜  : 결과 f    [순서---> false && (! false) --> false && (true) ---> false
		System.out.println( !(a>b) && ! (a>b)); // 5>7 --> f  5>7 --> f  -->둘다 !때문에 t로 바뀌므로 결과는 t
		
		
		
		
		
		
		
		
		
		
	}

}
