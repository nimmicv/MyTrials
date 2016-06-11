package com.samsung.parkinglot;

import java.util.*;

public class ParkingLot {

	/**
	 * @param args
	 */
	private static final int NUMBER_OF_SMALL_SLOTS = 10;
    private static final int NUMBER_OF_COMPACT_SLOTS = 10;
    private static final int NUMBER_OF_LARGE_SLOTS = 10;
    public Map<Vehicle, Slot> occupiedSlots;
    private List<Slot> smallSlots;
    private List<Slot> compactSlots;
    private List<Slot> largeSlots;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingLot pl = new ParkingLot();
		Vehicle vc = new Suv("AK403");
		int parkingNumber = pl.park(vc);
		System.out.println(parkingNumber);
		Vehicle vc2 = new MotorCycle("AK443");
		parkingNumber = pl.park(vc2);
		System.out.println(parkingNumber);
		Vehicle vc3 = new Suv("AK444");
		parkingNumber = pl.park(vc3);
		System.out.println(parkingNumber);
	}
	 public ParkingLot() {
	        smallSlots = new ArrayList<>(NUMBER_OF_SMALL_SLOTS);
	        compactSlots = new ArrayList<>(NUMBER_OF_COMPACT_SLOTS);
	        largeSlots = new ArrayList<>(NUMBER_OF_LARGE_SLOTS);
	        createSlots();
	        occupiedSlots = new HashMap<>();
	    }
	
	private void createSlots() {
		 
        for (int i = 1; i <= NUMBER_OF_SMALL_SLOTS; i++) {
            smallSlots.add(new Slot(i,SlotType.SMALL));
        }
        int compact_slots = NUMBER_OF_SMALL_SLOTS+1+NUMBER_OF_COMPACT_SLOTS;
        for (int i = NUMBER_OF_SMALL_SLOTS+1; i <= compact_slots; i++) {
            compactSlots.add(new Slot(i,SlotType.COMPACT));
        }
        int large_slots = compact_slots+1;
        for (int i = large_slots; i <= (large_slots+NUMBER_OF_LARGE_SLOTS); i++) {
            largeSlots.add(new Slot(i,SlotType.LARGE));
        }
 
    }
	
	public int park(Vehicle vehicle)
	{
		Slot slt = null;
		if(vehicle.canfitSmall())
		{
			slt = getFirstEmptySlot(smallSlots);
		}
		else
		if(vehicle.canfitCompact())
		{
			slt = getFirstEmptySlot(compactSlots);
		}
		else
		if(vehicle.canfitLarge())
		{
			slt = getFirstEmptySlot(largeSlots);	
		}
		if(slt != null)
		{
			slt.park();
			occupiedSlots.put(vehicle,slt);
			return slt.getSlotNumber();
		}
		else
		{
			return -1;
		}
	}
	
	public void unpark(Vehicle vehicle)
	{
		occupiedSlots.get(vehicle).unpark();
		occupiedSlots.remove(vehicle);
	}
	
	public Slot getFirstEmptySlot(List<Slot> list)
	{
		for(Slot slt : list)
		{
			if(!slt.isoccupied)
			{
				return slt;
			}
		}
		return null;
	}

}
