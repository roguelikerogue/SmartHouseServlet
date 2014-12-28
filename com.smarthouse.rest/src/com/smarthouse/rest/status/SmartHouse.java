package com.smarthouse.rest.status;

import java.util.ArrayList;

import SmartFunctions.Alarm;
import SmartFunctions.Outside;
import SmartFunctions.Rooms;

public class SmartHouse {
	private String address = "Street Name, Number Postcode City Name, Country";

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private ArrayList<Alarm> alarms = new ArrayList<Alarm>();
	private ArrayList<Outside> outside = new ArrayList<Outside>();
	private ArrayList<Rooms> rooms = new ArrayList<Rooms>();
	

	public ArrayList<Alarm> getAlarms() {
		return alarms;
	}

	public void setAlarms(ArrayList<Alarm> alarms) {
		this.alarms = alarms;
	}

	public ArrayList<Outside> getOutside() {
		return outside;
	}

	public void setOutside(ArrayList<Outside> outside) {
		this.outside = outside;
	}

	public ArrayList<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Rooms> rooms) {
		this.rooms = rooms;
	}

	public SmartHouse(String address, ArrayList<Alarm> alarms, ArrayList<Outside> outside,
			ArrayList<Rooms> rooms) {
		this.address = address;
		this.alarms = alarms;
		this.outside = outside;
		this.rooms = rooms;
	}
}