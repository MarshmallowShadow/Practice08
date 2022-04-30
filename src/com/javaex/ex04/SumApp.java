package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백 하나로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		String[] numArray = numLine.split(" ");
		
		//코드를 작성하세요
		try {
			for(int i=0; i<numArray.length; i++) {
				sum += Integer.parseInt(numArray[i]);
			}
			
			System.out.println("합:" + sum);
		} catch(Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
