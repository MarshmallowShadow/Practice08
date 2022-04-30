package com.javaex.ex05;
import java.util.*;

public class CalcApp {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String inputLine;
    	
    	int a;
    	int b;
    	int value;
    	
    	while(true) {
    		System.out.print(">> ");
    		inputLine = sc.nextLine();
    		
    		if(inputLine.equals("/q")) {
    			break;
    		}
    		
    		String[] inputArray = inputLine.split(" ");
			a = Integer.parseInt(inputArray[0]);
			b = Integer.parseInt(inputArray[2]);
			
			switch(inputArray[1]) {
				case("+"):
					Add add = new Add(a,b);
					value = add.calculate();
					System.out.println(">> " + value);
					break;
				case("-"):
					Sub sub = new Sub(a,b);
					sub.calculate();
					value = sub.calculate();
					System.out.println(">> " + value);
					break;
				case("*"):
					Mul mul = new Mul(a,b);
					value = mul.calculate();
					System.out.println(">> " + value);
					break;
				case("/"):
					Div div = new Div(a,b);
					value = div.calculate();
					System.out.println(">> " + value);
					break;
				case("%"):
					Mod mod = new Mod(a,b);
					value = mod.calculate();
					System.out.println(">> " + value);
					break;
				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
    		}
    	}
    	
    	System.out.println("종료합니다.");
    	sc.close();
    }
}
