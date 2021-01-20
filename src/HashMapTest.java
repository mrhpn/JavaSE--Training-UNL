import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Mg Mg", 40);
		scores.put("Aye Aye", 29);
		
		System.out.println(scores);
	}

}
