package assignment_6_3_up_down_casting;

public class UIControl {
	private boolean isEnabled = true;
	
	public UIControl(boolean isEnabled) {
		super();
		this.isEnabled = isEnabled;
	}

	public void enable() {
		isEnabled = true;
	}
	
	public void disable() {
		isEnabled = false;
	}
}
