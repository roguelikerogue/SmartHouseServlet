package SmartFunctions;

public class Outside

{
   
    private String name;

    private boolean state;

    private int selected;

	public Outside(String name, boolean state, int selected) {		
		this.name = name;
		this.state = state;
		this.selected = selected;
	}

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

	public int getSelected() {
		return selected;
	}

	public void setSelected(int selected) {
		this.selected = selected;
	}

	
	

	
}