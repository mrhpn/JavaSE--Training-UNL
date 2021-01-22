package assignment_6_4_abstract;

public class Main {

	/**
	 * Abstraction
	 * 
	 */
	public static void main(String[] args) {
		/**
		 * Here, we've created UI controls array with text box and checkbox.
		 * But we can't someone let create the following object inside the controls array:
		 * 	`new UIControl`
		 * because we don't know what the UI control is. We know what text box or check box is and how to render it. but
		 * we don't know those information for UI control.
		 * 
		 * It is a ABSTRACT concept. So I've declared UIControl as abstract so no one could accidently instantiate it.
		 * 
		 * I've also declared `render` method inside UIControl as abstract 
		 * which will force any classes that derives from the UIControl class to override it.
		 */
		UIControl[] controls = { new TextBox(), new CheckBox() };
		for(var control: controls)
			control.render();
	}

}
