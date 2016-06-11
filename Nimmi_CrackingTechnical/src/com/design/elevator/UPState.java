package com.design.elevator;

public class UPState implements ElevatorState {

	int floor;
	@Override
	public void currentStat() {
		// TODO Auto-generated method stub
		System.out.println("Current Satte is up");
		
	}
	
	public void goup(int x)
	{
		this.floor = x;
		System.out.println("Currently at floor "+ x);
	}

	@Override
	public void godown(int floor) {
		System.out.println("Elevator is going up Now");
		
	}

	@Override
	public void maintenance_Status() {
		// TODO Auto-generated method stub
		System.out.println("Elevator is not in maintenance state");
		
	}

}
