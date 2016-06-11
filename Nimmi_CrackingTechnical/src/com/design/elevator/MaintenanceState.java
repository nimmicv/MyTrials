package com.design.elevator;

public class MaintenanceState implements ElevatorState {

	@Override
	public void currentStat() {
		// TODO Auto-generated method stub
		System.out.println("Current State is Maintenance");
	}

	@Override
	public void goup(int floor) {
		System.out.println("Cannot go up..In Maintenance");
		
	}

	@Override
	public void godown(int floor) {
		System.out.println("Cannot go down..In Maintenance");
		
	}

	@Override
	public void maintenance_Status() {
		// TODO Auto-generated method stub
		System.out.println("Elevator is in Maintenance");
	}

}
