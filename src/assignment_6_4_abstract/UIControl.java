package assignment_6_4_abstract;

/**
 * UI control class is abstract concept.
 * 
 * @author Htet Phyo Naing
 *
 */
public abstract class UIControl {
	private boolean isEnabled = true;
	
	public void enable() {
		isEnabled = true;
	}
	
	public void disable() {
		isEnabled = false;
	}
	
	// MUST be override in child classes
	public abstract void render();
}
