package practicingLoops;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Give a number");
            int response = Integer.parseInt(scanner.nextLine());

            if(response == 5){
                break;
            }
        }
    }
}
