package com.javaex.ex05;

//javaC Ex11.java --> Ex11.class을 만듦.
//java Ex11      (Ex11.class)-->이걸 실행.


//java Ex11 -->원래 실행하던거.
// java Ex11 i am choi won ho --> 이렇게 실행시킬거임

//java 프로그램이 함--> String[] args = new String[5] 
public class Ex11 {
		
	public static void main(String[] args) { // args는 java만든 사람들이 정해놓은거.변수명임.

		System.out.println(args.length);
		
		
		
		if(args.length > 0) {
			if ( args[0].equals("-version")) { //Ex11 -version
				System.out.println("Ex11 버전 : 3.4343");
			} else if(args[0].equals("-help")) {//Ex11 -help
				System.out.println("지금부터 도움말 어쩌고 저쩌고");
				System.out.println("[-version] : 버전 정보를 확인할 수 있습니다.");
				System.out.println("[-help] : 도움말을 볼 수 있습니다.");
			} else {// Ex11 i am choi won ho
				for (int i = 0; i < args.length; i++) {
					System.out.println(args[i]);
				}

}
		
		
		

}
	}
}