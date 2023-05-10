package arrayLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
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

        System.out.println("Done entering integers into the list.");
        System.out.println("What number are you looking for in the list?");

        int key = scanner.nextInt();

        for(int i = 0; i < list.size(); i++) {
            String temp = Integer.toString(list.get(i));
            int[] newInt = new int[temp.length()];
            for (int k = 0; k < temp.length(); k++)
            {
                newInt[k] = temp.charAt(k) - '0';
            }
            for (int j : newInt) {
                if (j == key) {
                    System.out.println(list.get(i) + " is at index of " + i);
                    break;
                }
            }
        }
    }
}
