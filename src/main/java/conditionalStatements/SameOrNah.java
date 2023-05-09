package conditionalStatements;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String first = scanner.nextLine();
        System.out.println("Enter another word");
        String second = scanner.nextLine();

        String result = first.equalsIgnoreCase(second) ? "The words are the same" : "The words are not the same";
        System.out.printf(result);
    }
}
