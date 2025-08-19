package Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FavoriteSinger {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Map<Long, Integer> singerCount = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            long singer = sc.nextLong();
	            Integer count = singerCount.get(singer);
//	            if (count == null) {
//	                singerCount.put(singer, 1);
//	            } else {
//	                singerCount.put(singer, count + 1);
//	            }
	            singerCount.put(singer, count == null ? 1 : count + 1);
	            
	        }
	        
	        System.out.println(singerCount);
	        int maxCount = Collections.max(singerCount.values());
	        int favouriteSingers = 0;
	        for (int count : singerCount.values()) {
	            if (count == maxCount) {
	                favouriteSingers++;
	            }
	        }
	        System.out.println(favouriteSingers);
	}

}


//Description: Find the number of singers with the maximum song from the playlist. 