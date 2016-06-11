package com.samsung.parkinglot;

public class MotorCycle extends Vehicle {
	
	public MotorCycle(String number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canfitSmall() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean canfitLarge() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canfitCompact() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
