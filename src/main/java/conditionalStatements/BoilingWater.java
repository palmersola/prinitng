package conditionalStatements;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number");
        int temp =  Integer.parseInt(scanner.nextLine());
        if(temp >= 212){
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Water is still heating up.");
        }
    }
}
