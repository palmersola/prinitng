package methods;

import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 integer values to find the sum of the 3");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        System.out.println("Your average is: " + average(x,y,z));

    }

    public static double average(double x, double y, double z) {
        return (sum(x,y,z) / 3);
    }

    public static double sum(double x, double y, double z) {
        return x + y + z;
    }
}
