package SmartFunctions;

public class Devices {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	private boolean state;
	private String image;
	
	public Devices(String name, boolean state, String image)
	{
		this.name = name;
		this.state = state;
		this.image = image;
	}

}
