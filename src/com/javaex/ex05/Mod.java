package com.javaex.ex05;

public class Mod {
    
    private int a;
    private int b;
    
    public Mod(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	int sum = a % b;
    	return sum;
    }

}