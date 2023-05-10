package methods;

import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 numbers to be divided");
        System.out.println("First number");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Second number");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println(x + " / " + y + " = " + divide(x, y));
    }
    public static int divide(int x, int y){
        return x / y;
    }
}
