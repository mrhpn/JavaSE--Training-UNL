package oop.abstract_test;

public class Robot {
	
	int code;
	
	public Robot(int code) {
		Brain brain = new Brain();
		brain.setCode(code * code);
		
		System.out.println(brain.getCode());
	}
	
	// nested class - to use data hide
	private class Brain {
		int code;

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
		
		
	}
}
