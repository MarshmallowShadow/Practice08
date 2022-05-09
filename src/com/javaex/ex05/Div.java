package com.javaex.ex05;

public class Div {

    private int a;
    private int b;
    
    public Div(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	try {
    		int quot = a / b;
    		return quot;
    	} catch (ArithmeticException e) {
    		System.out.println("0으로 나눌 수 없습니다.");
    		return 0;
    	}
    }

}
