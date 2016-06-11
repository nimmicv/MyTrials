package com.design.elevator;

public class DownState implements ElevatorState{

	@Override
	public void currentStat() {
		// TODO Auto-generated method stub
		System.out.println("Current State is Down");
		
	}

	@Override
	public void goup(int floor) {
		// TODO Auto-generated method stub
		System.out.println("Cannot go up.. Elevator is going down ");
		
	}

	@Override
	public void godown(int floor) {
		System.out.println("Going down to floor "+floor);
		
	}

	@Override
	public void maintenance_Status() {
		// TODO Auto-generated method stub
		System.out.println("Elevator is not in maintenance state");
		
	}

}
