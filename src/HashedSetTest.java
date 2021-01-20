import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashedSetTest {
	public static void main(String[] args) {
		// Set<String> cities = new HashSet<>(); - unordered list
		Set<String> cities = new LinkedHashSet<>();
		
		cities.add("Yangon");
		cities.add("Mandalay");
		cities.add("Yangon");
		cities.add("Taung Gyi");
		
		// unique list of cities
		System.out.println(cities);
	}
}
