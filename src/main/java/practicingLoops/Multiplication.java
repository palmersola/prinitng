package practicingLoops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int response = Integer.parseInt(scanner.nextLine());
        int i = 1;

        while (i <= 10){
            System.out.println(response + " x " + i + " = " + (response * i));
            i++;
        }
    }
}
