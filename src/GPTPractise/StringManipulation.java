package GPTPractise;

public class StringManipulation {
	
	public static void main(String[] args) {
		rearrangeWords("hello world java automation");
	}
		

	public static void rearrangeWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        // Find max length
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }

        // Append in length order
        for (int len = 1; len <= maxLength; len++) {
            for (String word : words) {
                if (word.length() == len) {
                    result.append(word).append(" ");
                }
            }
        }

        System.out.println(result.toString().trim());
    }

}



