package com.samsung.parkinglot;

public abstract class Vehicle {
	String number;
	public Vehicle(String number)
	{
		this.number = number;
	}
	
	public abstract boolean canfitCompact();
	public abstract boolean canfitSmall();
	public abstract boolean canfitLarge();
	

	public boolean equals(Object o)
	{
		return (this.number == ((Vehicle) o).number);
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
