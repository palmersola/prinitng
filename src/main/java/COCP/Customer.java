package COCP;

import java.util.ArrayList;
import java.util.Random;

public class Customer {
    Random rand = new Random();

    private final String name;
    private double balance;
    private int accountNum;

        public Customer(String name, double balance) {
            this.name = name;
            this.balance = balance;
            this.accountNum = rand.nextInt(100000);
        }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void deposit(double amount) {
            this.balance = this.balance + amount;
        }

        public void withdrawal(double amount) {
            this.balance = this.balance - amount;
        }

        public void print() {
            System.out.println(getName() + "'s account balance is: " + getBalance());
        }

}
