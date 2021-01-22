package assignment_6_2_polymorphism;

public class UIControl {
	private boolean isEnabled = true;
	
	public void enable() {
		isEnabled = true;
	}
	
	public void disable() {
		isEnabled = false;
	}
	
	// will be override in child classes
	public void render() {}
}
