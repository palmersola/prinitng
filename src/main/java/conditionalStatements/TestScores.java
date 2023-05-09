package conditionalStatements;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number");
        int score =  Integer.parseInt(scanner.nextLine());
        String result = (score >= 90) ? "Your grade is an A":
                (score >= 80) ? "Your grade is a B":
                        (score >= 70) ? "Your grade is a C":
                                (score >= 60) ? "Your grade is a D":
                                        "Your grade is an F";
        System.out.printf(result);
    }
}
