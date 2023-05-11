import java.util.Scanner;

public class ChatBot {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet();
        String name = askName();
        int age = guessAge();
        int count = countTo();
        boolean quiz = quiz();
        finalMethod(name, age, count, quiz);
    }

    public static void greet() {
        System.out.println("GREETINGS EARTHLING *beep boop*");
    }

    public static String  askName() {
        System.out.println("WHAT IS YOUR NAME *boop beep*");
        return scanner.nextLine();
    }

    public static int guessAge() {
        int age = 40;
        int guess = 10;
        while(true) {
            System.out.println("*y/n* ARE YOU " + age + "? *bing bong*");
            if(scanner.nextLine().equalsIgnoreCase("y")){
                return age;
            }
            System.out.println("*y/n* ARE YOU OLDER THAN " + age + "? *bong bing*");
            age = (scanner.nextLine().equalsIgnoreCase("y"))? age + guess : age - guess;
            guess--;
            if(guess < 1) guess = 1;
        }
    }

    public static int countTo() {
        System.out.println("WHAT NUMERICAL VALUE SHOULD I COUNT TO? *eek creek*");
        int countTo = scanner.nextInt();
        int i = 0;
        for( i = 1; i < countTo; i++) {
            System.out.println(i);
        }
        System.out.println("I CAN COUNT TO " + i + " *creek eek*");
        return i;
    }

    public static boolean quiz() {
        String[] quizQuestions = {
                "   A. Shorthand for crating classes",
                "   B. British Alt-Rock band from the 80's",
                "   C. Shortened if/else block",
                "   D. Means of which the front and back end communicate"
        };

        System.out.println("WHAT IS A TERNARY OPERATOR? *quack slap*\n");

        for(String i : quizQuestions) {
            System.out.println(i);
        }

        System.out.println("\n Enter A, B, C, or D");

        while(!scanner.nextLine().equalsIgnoreCase("C")){
            System.out.println("OOPS GUESS AGAIN *slap quack*");
        }
        System.out.println("CONGRATS YOU ARE A PROGRAMMER *quack quack*");
        return true;
    }

    public static void finalMethod(String name, int age, int count, boolean quiz) {
        System.out.println("\nCONGRATS " + name + " WHO IS " + age + " YEARS OLD AND NOW KNOWS HOW TO COUNT TO " + count + ". ARE YOU A PROGRAMMER? " + quiz);
    }
}

