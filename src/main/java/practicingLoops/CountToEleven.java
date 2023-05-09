package practicingLoops;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int response = Integer.parseInt(scanner.nextLine());

        while (response <= 11) {
            System.out.println(response);
           response++;
        }
    }
}
