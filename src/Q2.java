
import java.util.List;

/** CLASS: Q2
 *  DESCRIPTION: contains methods for question 2 program logic
 */
public class Q2 {

    /** METHOD: getRandomInt
     *  DESCRIPTION: returns a random int between 0 and 100 inclusive
     * @return an int between 0 and 100 inclusive
     */
    public int getRandomInt() {
        return (int) (Math.random() * 100);
    }

    /** METHOD: printList
     *  DESCRIPTION: prints out all the values contained in a list in order
     * @param list the provided list
     */
    public void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /** METHOD: getSumList
     *  DESCRIPTION: gets the sum of all the values in a list
     * @param list the provided list
     * @return an int representing the sum
     */
    public int getSumList(List<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum;
    }

    /** METHOD: getAverageList
     *  DESCRIPTION: gets the average of all the values in a list
     * @param list the provided list
     * @return a float representing the average
     */
    public float getAverageList(List<Integer> list) {
        float sum = getSumList(list);
        return (sum / list.size());
    }

}
