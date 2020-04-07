package com.lgs.lab.interface1;

public class Application {
	public static void main(String[] args) {
		
		MyCalculator MC= new MyCalculator(6,3);
		MC.plus();
		MC.minus();
		MC.multiply();
		MC.devide();
	}
}
