package conditionalStatements;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num1 =  Integer.parseInt(scanner.nextLine());
        System.out.println("Enter another Number");
        int num2 =  Integer.parseInt(scanner.nextLine());

        String print = (num1 > num2)? "The first number was larger than the second":
                (num1 < num2 )? "The second number was larger than the first":
                        "Numbers are the same";
        System.out.println(print);
    }
}
