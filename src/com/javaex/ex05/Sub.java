package com.javaex.ex05;

public class Sub {

    private int a;
    private int b;
    
    public Sub(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	int diff = a - b;
    	return diff;
    }

}
