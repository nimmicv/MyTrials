package com.design.elevator;

public class Elevator implements ElevatorState{
	
	ElevatorState state = new UPState();
	
	public static void main(String[] args)
	{
		Elevator evt = new Elevator();
		evt.goup(4);
		evt.godown(3);
		evt.maintenance_Status();
	}

	@Override
	public void currentStat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goup(int floor) {
		// TODO Auto-generated method stub
		state.goup(4);
		
	}

	@Override
	public void godown(int floor) {
		// TODO Auto-generated method stub
		state.godown(2);
		
	}

	@Override
	public void maintenance_Status() {
		// TODO Auto-generated method stub
		state.maintenance_Status();
		
	}
	

}
