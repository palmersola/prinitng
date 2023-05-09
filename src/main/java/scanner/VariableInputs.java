package scanner;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String str = scanner.nextLine();
        System.out.println("Enter an integer:");
        int inte = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Enter a double:");
        Double doub = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value:");
        Boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + str);
        System.out.println("Your integer is " + inte);
        System.out.println("Your double is " + doub);
        System.out.println("Your boolean is " + bool);
    }
}
