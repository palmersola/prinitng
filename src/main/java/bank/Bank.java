package bank;

import COCP.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        String find = "";

        customers.add(new Customer("Palmer", 500));
        customers.add(new Customer("Peter", 5000));
        customers.add(new Customer("Sarah", 300));


       System.out.println("Welcome to The Bank! Are you a returning customer? y/n");

       if(scanner.nextLine().equalsIgnoreCase("y")){
           System.out.println("Please enter customer name:");
           find = scanner.nextLine();
       } else {
           System.out.println("Please enter Name:");
           String name = scanner.nextLine();
           System.out.println("Please enter starting balance:");
           int balance = scanner.nextInt();
           scanner.nextLine();
           customers.add(new Customer(name, balance));
           find = name;
       }

        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(find)) {
                mainMenu(customer, customers);
            }
        }


    }

    public static void mainMenu(Customer customer1, ArrayList<Customer> customers){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello " + customer1.getName() + "!");
            System.out.println("Welcome to the main menu, what would you like to do today?");
            System.out.println("1. Check account balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer to other account");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            } else if (choice == 1) {
                System.out.println(customer1.getBalance());
            } else if (choice == 2) {
                System.out.println("How much would you like to withdraw?");
                customer1.withdrawal(scanner.nextDouble());
                System.out.println("New balance: " + customer1.getBalance());
            } else if (choice == 3) {
                System.out.println("How much would you like to deposit?");
                customer1.deposit(scanner.nextDouble());
                System.out.println("New balance: " + customer1.getBalance());
            } else if (choice == 4) {
                System.out.println("Who would you like to transfer money too?");
                String user = scanner.nextLine();
                System.out.println("How much would you like to transfer?");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                customer1.withdrawal(amount);
                System.out.println(customer1.getName() + "'s new balance: " + customer1.getBalance());
                for (Customer customer2 : customers) {
                    if (customer2.getName().equalsIgnoreCase(user)) {
                        customer2.deposit(amount);
                        System.out.println(customer2.getName() + "'s new balance: " + customer2.getBalance());
                    }
                }
                System.out.println("Return to main menu? y/n");
                if (scanner.nextLine().equalsIgnoreCase("N"))break;
            }
        }
    }
}
