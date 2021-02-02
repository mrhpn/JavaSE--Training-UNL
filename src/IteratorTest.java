import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherries");
		fruits.add("Dragon Fruit");
		
		Iterator<String> it = fruits.iterator();
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
