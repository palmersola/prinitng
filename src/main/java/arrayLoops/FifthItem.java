package arrayLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
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

        System.out.println("The fifth item in the list is: " + list.get(4));

    }
}

