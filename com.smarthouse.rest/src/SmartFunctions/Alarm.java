package SmartFunctions;

public class Alarm
{
   
    private String name;

    private boolean state;

    private int selected;

	public Alarm(String name, boolean state, int selected) {		
		this.name = name;
		this.state = state;
		this.selected = selected;
	}

	public String getName() {
		return name;
	}

	public boolean isState() {
		return state;
	}

	public int getSelected() {
		return selected;
	}    
}