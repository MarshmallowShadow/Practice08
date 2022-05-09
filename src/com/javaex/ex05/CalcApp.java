package com.javaex.ex05;
import java.util.*;

public class CalcApp {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String inputLine;
    	
    	int a;
    	int b;
    	String op;
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
			op = inputArray[1];
			
			if(op.equals("+")) {
				Add add = new Add(a,b);
				value = add.calculate();
				System.out.println(">> " + value);
			}
			else if(op.equals("-")) {
				Sub sub = new Sub(a,b);
				sub.calculate();
				value = sub.calculate();
				System.out.println(">> " + value);
    		}
			else if(op.equals("*")) {
    			Mul mul = new Mul(a,b);
				value = mul.calculate();
				System.out.println(">> " + value);
    		}
			else if(op.equals("/")) {
    			Div div = new Div(a,b);
				value = div.calculate();
				System.out.println(">> " + value);
    		}
			else if(op.equals("%")) {
    			Mod mod = new Mod(a,b);
				value = mod.calculate();
				System.out.println(">> " + value);
    		}
			else {
				System.out.println("알 수 없는 연산입니다.");
    		}
    	}
    	
    	System.out.println("종료합니다.");
    	sc.close();
    }
}
