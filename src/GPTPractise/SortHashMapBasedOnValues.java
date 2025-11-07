package GPTPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapBasedOnValues implements Comparator<Map.Entry<String, Integer>> {

	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Akash", 85);
		scores.put("Vikas", 92);
		scores.put("Priya", 85);
		scores.put("Rohan", 78);

		List<Map.Entry<String, Integer>> list = new ArrayList<>(scores.entrySet());

		Collections.sort(list, new SortHashMapBasedOnValues());	    

		for (Map.Entry<String, Integer> entry : list) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

	@Override
	 public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
        // Compare by value (descending)
//		int valueCompare= e2.getValue()-e1.getValue();
        int valueCompare = e2.getValue().compareTo(e1.getValue());
        if (valueCompare != 0) {
            return valueCompare;
        }
        // If values same, compare by key (ascending)
        return e1.getKey().compareTo(e2.getKey());
    }

}
