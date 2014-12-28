package SmartFunctions;

import java.util.ArrayList;

public class Rooms {

	private String name;

	public String getName() {
		return name;
	}

	public ArrayList<Devices> getDevices() {
		return devices;
	}

	public int getSelected() {
		return selected;
	}

	private ArrayList<Devices> devices;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setDevices(ArrayList<Devices> devices) {
		this.devices = devices;
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}

	private int selected;

	public Rooms(String name, ArrayList<Devices> devices, int selected) {
		this.name = name;
		this.devices = devices;
		this.selected = selected;
	}

	
	

}
