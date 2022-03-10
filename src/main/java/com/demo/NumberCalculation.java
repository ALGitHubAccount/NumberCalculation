package com.demo;

/**
 * @author: Antonyo Lebab
 * @time:Mar 10, 2022-10:53:12 AM
 */
public class NumberCalculation {
	String temp = "";
	public int add(int x, int y) {
		return x+y;
		
	}
	
	public String CovertCase(String str) {  // str=hello // ASCII 97-121(capital letter), 65,91
		
		for(int i=0; i<str.length();i++) {
			int x=str.charAt(i);
			x=x-32;
			temp=temp+ (char)x;
		}
		return temp;
	}
}
