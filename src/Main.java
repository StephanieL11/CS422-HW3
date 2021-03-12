import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Header
        printHeader();

        // Objects
        Scanner scan = new Scanner(System.in);
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();

        // Q1
        runQ1(scan, q1);

        // Q2
        runQ2(scan, q2);

    }

    private static void printHeader() {
        System.out.println("\nMET CS 422");
        System.out.println("Spring 2021");
        System.out.println("HW3 (Generic Collection Classes)");
        System.out.println("Stephanie Lin\n");
    }

    private static void runQ1(Scanner scan, Q1 q1) {
        System.out.println("-----------------------------------------");
        System.out.println("Q1: COUNT THE DUPLICATE WORDS");
        System.out.println("-----------------------------------------");

        System.out.println("Please enter a sentence: ");
        String input = scan.nextLine();
        while (!input.equalsIgnoreCase("q")) {
            int duplicateWords = q1.countDuplicateWords(input);
            System.out.println("Number of duplicate words: " + duplicateWords + "\n");
            System.out.println("Enter another sentence, or q to quit:");
            input = scan.nextLine();
        }
    }

    private static void runQ2(Scanner scan, Q2 q2) {
        System.out.println("-----------------------------------------");
        System.out.println("Q2: LINKED LIST w/ 25 RANDOM INTS");
        System.out.println("-----------------------------------------");

        System.out.println("Print: ");
        System.out.println("Sum: ");
        System.out.println("Average: ");
    }



}
