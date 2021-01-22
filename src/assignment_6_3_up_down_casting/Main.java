package assignment_6_3_up_down_casting;

public class Main {
	public static void main(String[] args) {
		var textBox = new TextBox(true);
		
		/**
		 * First, UPCASTING occurs because textBox will be accepted with its parent class which is UIControl in show method. 
		 * Then, in the show method, control object is DOWNCASTED by TextBox which occurs DOWNCASTING.
		 */
		show(textBox);
	}
	
	public static void show(UIControl control) {
		/**
		 * In run time, we are dealing with textBox object, but in the compile time, with control object. 
		 * So, in the compile time, we don't have textBox's methods. We only have UIControl's methods.
		 * 
		 * But, when we want to use textBox's properties, we need to here explicitly safely downcast the control object
		 * by using instanceof operator.
		 */
		TextBox textBox;
		if (control instanceof TextBox) {
			textBox = (TextBox) control;
			textBox.setText("Hello World");			
		}
		
		System.out.println(control);
	}
}
