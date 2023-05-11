package objectsInLists;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> shows = new ArrayList<>();

        System.out.println("Loop will break when no name is given.");
        while (true) {
            System.out.println("Name of show:");
            String name = scanner.nextLine();

            if(name.equals("")) break;

            System.out.println("Number of episodes:");
            int episodes = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Genre the show belongs to:");
            String genre = scanner.nextLine();
            shows.add(new TvShow(name, episodes, genre));

        };

        for (TvShow show: shows) {
            System.out.println(show.toString());
        }
    }
}
