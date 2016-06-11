package com.design.elevator;

public interface ElevatorState {
	
	public void currentStat();
	public void goup(int floor);
	public void godown(int floor);
	public void maintenance_Status();;

}
