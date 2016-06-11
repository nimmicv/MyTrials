package com.samsung.parkinglot;

public class Truck extends Vehicle{
	public Truck(String number)
	{
		super(number);
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
