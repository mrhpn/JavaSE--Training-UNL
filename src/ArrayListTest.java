import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	/**
	 * Disadvantages of standard array
	 * -------------------------------
	 * 1. can't shrink
	 * 2. can't expand
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<String> countryList = new ArrayList<String>();
		countryList.add("Myanmar");
		countryList.add("Japan");
		
		System.out.println(countryList.get(1));
		countryList.remove(1);
		System.out.println(countryList);
		System.out.println(countryList.contains("USA"));
		System.out.println(countryList.indexOf("Thailand"));
		
		Collections.sort(countryList);
		Collections.shuffle(countryList);
		Collections.reverse(countryList);
		
		List<String> moreCountries = new ArrayList<String>();
		moreCountries.add("Brizal");
		moreCountries.addAll(countryList);
		System.out.println(moreCountries);

	}

}
