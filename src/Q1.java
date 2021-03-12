
import java.util.HashSet;
import java.util.Set;

/** CLASS: Q1
 *  DESCRIPTION: contains methods for question 1 program logic
 */
public class Q1 {

    /** METHOD: countDuplicateWords
     *  DESCRIPTION: counts the number of duplicate words in a string
     * @param inputString the string
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

}
