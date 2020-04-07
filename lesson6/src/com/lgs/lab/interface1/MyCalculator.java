package com.lgs.lab.interface1;

import com.lgs.lab.interface2.Numerable;

public class MyCalculator implements Numerable {
	private int firstnumber;
	private int secondnumber;

	public MyCalculator(int firstnumber, int secondnumber) {
		super();
		this.firstnumber = firstnumber;
		this.secondnumber = secondnumber;
	}

	@Override
	public void plus() {
		System.out.println(firstnumber+secondnumber);
	}
	@Override
	public void minus() {
		System.out.println(firstnumber-secondnumber);
	}
	@Override
	public void multiply() {
		System.out.println(firstnumber*secondnumber);
			}
	@Override
	public void devide() {
		System.out.println(firstnumber/secondnumber);
	}

}
