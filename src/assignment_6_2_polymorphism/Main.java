package assignment_6_2_polymorphism;

public class Main {

	/**
	 * POLYMORPHISM in action
	 * ----------------------
	 * Here, in a example of rendering different types of UI controls, Polymorphism is demonstrated 
	 * by letting `control` object taking different types of UI controls, different types of forms.
	 * 
	 * 
	 * Although polymorphism is well demonstrated in this package, there are other concepts available such as
	 * - inheritance       -> to inherit properties of a parent class by child classes
	 * - method overriding -> to change implementation of the parent class when we are not happy in child classes 
	 *   (There is also a situation where method overriding may occur when implementing interfaces.)
	 * 
	 */
	public static void main(String[] args) {
		UIControl[] controls = { new TextBox(), new CheckBox(), new RadioButton() };
		for(var control: controls)
			control.render();
	}

}
