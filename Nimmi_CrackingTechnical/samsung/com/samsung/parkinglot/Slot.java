package com.samsung.parkinglot;

public class Slot {
	int slotnumber;
	boolean isoccupied;
	SlotType type;
	public Slot(int number, SlotType type)
	{
		this.slotnumber = number;
		this.isoccupied = false;
		this.type = type;
	}
	public SlotType getType()
	{
		return type;
	}
	public  boolean checkifOccupied()
	{
		return isoccupied;
	}
	public int getSlotNumber()
	{
		return slotnumber;
	}
	public void park()
	{
		isoccupied = true;
	}
	public void unpark()
	{
		isoccupied = false;
	}
	

}
