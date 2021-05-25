package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "최원호";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println("str");
		
		System.out.println(i);
		System.out.println("i");
		System.out.println('i');
		System.out.println("ii");      //'' 한글자 출력   "" 두글자 이상 출력
		
		/*
		System.out.print("안녕");
		System.out.print("하");
		*/
		System.out.println("안녕");      //print = 줄바꿈 안함 그 뒤에 이어서 출력
		System.out.println("하");          //println = 줄바꿈하기 때문에 아래에 출력
 		
		System.out.println("--------------");
		
		System.out.println(i);
		System.out.println(i+i);
		

		System.out.println(str);
		System.out.println(str+str);
		
		System.out.println(str+i);  //  "굿모닝" + 2345 --> "굿모닝" + "2345"  문자열로 바뀜.
		System.out.println(str+d);  //  "굿모닝" + 3.14 --> "굿모닝" + "3.14"  문자열로 바뀜.
		System.out.println(str+" 이랑 "+i+" 다");   //  +를 해줘야 오류 안남  공백은 ""안에 공백을 넣어줌
		System.out.println(str+" "+i+" 다");
		
		//주의
		System.out.println(c);
		System.out.println(c + c);   // 특히 주의
		System.out.println(s + s);
		System.out.println(c + s);
		
		// 제 이름은 최원호 입니다.--> 출력하고 싶음
		System.out.println("제 이름은 " + name + " 입니다.");
		
		System.out.println("안녕하세요"); //안녕하세요		
		System.out.println("안녕'하'세요"); //"안녕'하'세요"
		System.out.println("안녕\"하\"세요");//"안녕"하"세요"  \--> 문자열 안에서 한세트
		
		System.out.println("안녕\\하\\세요"); //안녕\하\세요
		System.out.println("안녕\t하\t세요"); // 안녕	하	세요   --> 일정간격 벌림(간격이 맞지는 않음)
		System.out.println("안녕\n하세요"); // 안녕 (줄바꿈 후) 하세요   ---> \n 은 new line  줄바꿈해줌
		
	}

}
