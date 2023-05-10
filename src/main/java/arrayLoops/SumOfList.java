package arrayLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            int item = scanner.nextInt();

            if (item == 0) {
                break;
            } else {
                list.add(item);
            }
        }

        System.out.println("BEEP BOOP");
        System.out.println("CALCULATING");
        System.out.println("BOOP BEEP");

        int sum = 0;

        String printText = "";

        for (int i = 0; i < list.size(); i++) {

            if (i == (list.size() - 1)){
                printText += "and " + list.get(i);
            } else{
                printText += list.get(i) + ", ";
            }

            sum += list.get(i);
        }

        printText += " were the items in the list. The sum of the list is: " + sum;

        System.out.println(printText);

    }
}
