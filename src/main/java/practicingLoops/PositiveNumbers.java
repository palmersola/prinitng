package practicingLoops;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number");
            int response = Integer.parseInt(scanner.nextLine());

            if (response > 0) {
                System.out.println("Number is " + response);
            } else if (response < 0) {
                System.out.println("Number must be a positive number");
            } else { break; }
        }
    }
}
