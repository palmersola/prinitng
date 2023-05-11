package COCP;

public class Customer {
    private final String name;
    private double balance;

        public Customer(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public void deposit(double amount) {
            this.balance = this.balance + amount;
        }

        public void withdrawal(double amount) {
            this.balance = this.balance - amount;
        }

        public void print() {
            System.out.println(this.name + "'s account balance is: " + this.balance);
        }
}
