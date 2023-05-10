package arrayLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Please print a list of strings.");

        while (true) {
            String item = scanner.nextLine();
            if (item.equals("")) {
                break;
            } else {
                list.add(item);
            }
        }

        System.out.println("The total amount of items in the list was: " + list.size());

    }
}
