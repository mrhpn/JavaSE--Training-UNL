import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Mg Mg", 40);
		scores.put("Aye Aye", 29);
		
		System.out.println(scores.containsKey("Mg Mg"));
		System.out.println(scores.containsValue(40));
		
		scores.replace("Mg Mg", 900);
		scores.remove("Mg Mg");
		
		System.out.println(scores);
	}

}
