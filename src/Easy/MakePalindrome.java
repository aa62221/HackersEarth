package Easy;

import java.util.HashMap;
import java.util.Scanner;

public class MakePalindrome {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> freqMap = new HashMap<>();
            for (char c : s.toCharArray()) {
            	 freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);                          	
            }
            System.out.println(freqMap);
            int oddCount = 0;            
			for (int count : freqMap.values()) {
				if (count % 2 != 0) {
					oddCount++;
				}
			}
            System.out.println(Math.max(0, oddCount - 1)); //Return greater of 0 or oddCount - 1
            
        }
        sc.close();
    }
}

//Description: Program to find the minimum number of characters that need to be removed/added from a string to make it a palindrome.
