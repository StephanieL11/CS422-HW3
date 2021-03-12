
/** #############################################################################
 * COURSE: BU MET CS422 (Advanced Java)
 * SEMESTER: Spring 2021
 * PROFESSOR: Vic Berry
 * AUTHOR: Stephanie Lin
 *
 * TITLE: Homework 3 (Java Generic Collection Classes)
 *
 * DESCRIPTION: this program answers the 2 questions assigned in homework 3
 * Q1. Using Generic Collections write a program that
 * determines and prints the number of duplicate words in a sentence.
 * Q2. Write a program that inserts 25 random integers into a LinkedList in order.
 * Once the numbers are added, print the list, sum, and floating-point average.
 *
 * ASSUMPTIONS:
 * 1. Words only contain the letters A-Z
 * 2. Upper & lowercase letters are treated as the same
 * 3. A duplicate word is defined as any word that has already been seen
 * 4. Random integers are between 0 & 100 (inclusive)
 ############################################################################# */


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/** CLASS: Main
 *  DESCRIPTION: Handles main program logic
 */
public class Main {

    /** METHOD: main
     * DESCRIPTION: program entry point
     */
    public static void main(String[] args) {

        // Print Header
        printHeader();

        // Initialize Objects
        Scanner scan = new Scanner(System.in);
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();

        // Run Programs
        runQ1(scan, q1);
        runQ2(scan, q2);

        // Print Closer
        System.out.println("End of Program!");

    }


    /** METHOD: printHeader
     *  DESCRIPTION: prints program info to the console
     */
    private static void printHeader() {
        System.out.println("\nMET CS 422");
        System.out.println("Spring 2021");
        System.out.println("HW3 (Generic Collection Classes)");
        System.out.println("Stephanie Lin\n");
    }


    /** METHOD: runQ1
     *  DESCRIPTION: contains program logic for assignment question 1
     * @param scan = scanner object
     * @param q1 = Q1 object
     */
    private static void runQ1(Scanner scan, Q1 q1) {

        // Print Header
        System.out.println("-----------------------------------------");
        System.out.println("Q1: COUNT THE DUPLICATE WORDS");
        System.out.println("-----------------------------------------");

        // Prompt User to Input Sentence
        System.out.println("Please enter a sentence: ");
        String input = scan.nextLine();

        // Continue Looping until User Enters Q
        while (!input.equalsIgnoreCase("q")) {
            // Count Duplicate Words & Print Result
            int duplicateWords = q1.countDuplicateWords(input);
            System.out.println("Number of duplicate words: " + duplicateWords + "\n");
            // Prompt User to Input Sentence, or Q to Quit
            System.out.println("Enter another sentence, or q to quit:");
            input = scan.nextLine();
        }
    }


    /** METHOD: runQ2
     *  DESCRIPTION: contains program logic for assignment question 2
     * @param scan = scanner object
     * @param q2 = Q2 object
     */
    private static void runQ2(Scanner scan, Q2 q2) {

        // Print Header
        System.out.println("-----------------------------------------");
        System.out.println("Q2: LINKED LIST w/ 25 RANDOM INTS");
        System.out.println("-----------------------------------------");

        // Track Whether or Not to TryAgain
        boolean tryAgain = true;

        // Continue Looping until tryAgain is false
        while (tryAgain) {

            // Create New Linked List
            List<Integer> list = new LinkedList<>();
            // Add 25 Random Ints
            for (int i = 0; i < 25; i++) {
                list.add(q2.getRandomInt());
            }

            // Print List
            System.out.print("List: ");
            q2.printList(list);
            // Print Sum
            System.out.println("Sum: " + q2.getSumList(list));
            // Print Average
            System.out.println("Average: " + q2.getAverageList(list));

            // Prompt user to enter Y (to try again), or N (to quit)
            System.out.println("\nTRY AGAIN? Enter Y or N.");
            String input = scan.nextLine();
            // Update boolean
            if (input.equalsIgnoreCase("Y")) {
                tryAgain = true;
            } else {
                tryAgain = false;
            }
        }

    }

}
