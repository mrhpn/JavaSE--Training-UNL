package generic;

import oop.abstract_test.Animal;

public class AnimalBox<T extends Animal> {
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
