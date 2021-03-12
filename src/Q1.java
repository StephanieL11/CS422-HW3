
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** CLASS: Q1
 *  DESCRIPTION: contains methods for question 1 program logic
 */
public class Q1 {

    /** METHOD: countDuplicateWords
     *  DESCRIPTION: counts the number of duplicate words in a string
     * @param inputString the input string
     * @return an int representing the number of duplicates
     */
    public int countDuplicateWords(String inputString) {

        // Use RegEx to Replace Invalid Characters
        String str = inputString.replaceAll("[^a-zA-Z\\s]", "");
        // Convert Input to All Lowercase
        str = str.toLowerCase();
        // Split Input (by whitespace) into Array of Words
        String[] words = str.split(" ");

        // Create a Set
        Set<String> uniqueWords = new HashSet<>();
        // Add Unique Words To Set
        for (String word : words) {
            uniqueWords.add(word);
        }

        // Count Duplicates
        int duplicateWords = words.length - uniqueWords.size();
        // Return Result
        return duplicateWords;
    }


    /** METHOD: mapWordToCount
     *  DESCRIPTION: uses a string to create a map where
     *      key = unique word
     *      value = key count (i.e., the number of times the word appears)
     * @param inputString the input string
     * @return the map of unique words to corresponding count
     */
    public Map<String, Integer> mapWordToCount(String inputString) {

        // Use RegEx to Replace Invalid Characters
        String str = inputString.replaceAll("[^a-zA-Z\\s]", "");
        // Convert Input to All Lowercase
        str = str.toLowerCase();
        // Split Input (by whitespace) into Array of Words
        String[] words = str.split(" ");

        // Create Map (word : count)
        Map<String, Integer> map = new HashMap<>();

        // Populate Map
        for (String word : words) {
            // Map already contains word
            if (map.containsKey(word)) {
                // Get Word's Current Count
                int curCount = map.get(word);
                // Increment Word's Current Count
                curCount++;
                // Update the Map
                map.put(word, curCount);
            }
            // Map does not contain word
            else {
                // Add Word to Map
                map.put(word, 1);
            }
        }

        // Return Map
        return map;
    }

}
