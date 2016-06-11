package com.samsung.parkinglot;

public class Suv extends Vehicle {
	public Suv(String number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canfitCompact() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canfitSmall() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canfitLarge() {
		// TODO Auto-generated method stub
		return true;
	}

}
