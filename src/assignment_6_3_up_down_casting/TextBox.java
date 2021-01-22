package assignment_6_3_up_down_casting;

public class TextBox extends UIControl {
	
	private String text;

	public TextBox(boolean isEnabled) {
		super(isEnabled);
	}
	
	@Override
	public String toString() {
		return text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
