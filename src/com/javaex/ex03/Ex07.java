package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//내가 한거
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요 : ");
				
		int point = sc.nextInt();
		
		if (point >= 90) {  
			System.out.println("A등급");			
		} else if (point >= 80) {
			System.out.println("B등급");	
		} else if (point >= 70) {
			System.out.println("C등급");	
		} else if (point >= 60 ) {
			System.out.println("D등급");	
		} else {
			System.out.println("F등급");	
		}
		sc.close();
		
		
		
		// &&사용법
		/*
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요 : ");
				
		int point = sc.nextInt();
		
		if (point >= 90) {  
			System.out.println("A등급");			
		} else if (point >= 80 && point <=89) {
			System.out.println("B등급");	
		} else if (point >= 70 && point <=79) {
			System.out.println("C등급");	
		} else if (point >= 60 && point <=69) {
			System.out.println("D등급");	
		} else {
			System.out.println("F등급");	
		}
		sc.close();
		*/
		
		
	
	 	
		
		}		
	}


