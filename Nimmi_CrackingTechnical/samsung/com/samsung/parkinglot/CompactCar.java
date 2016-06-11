package com.samsung.parkinglot;

public class CompactCar extends Vehicle {

	public CompactCar(String number)
	{
		super(number);
	}
	@Override
	public boolean canfitCompact() {
		// TODO Auto-generated method stub
		return true;
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
	public boolean equals(Object o)
	{
		return (this.number == ((CompactCar) o).number);
	}
	public int hascode()
	{
		 int hash = 5;
		 for(int i=0;i<this.number.length();i++)
		 {
			 hash = (hash * 31) + number.charAt(i); 
		 }
	      return hash;
	}

}
