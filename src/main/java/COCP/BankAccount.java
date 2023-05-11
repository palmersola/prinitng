package COCP;

public class BankAccount {
    public static void main(String[] args) {
        Customer Palmer = new Customer("Palmer", 500);
        Customer Peter = new Customer("Peter", 5000);
        Customer Sarah = new Customer("Sarah", 300);

        Palmer.deposit(100);
        Palmer.print();
        System.out.println("");

        Peter.withdrawal(100);
        Sarah.deposit(100);
        Peter.print();
        Sarah.print();
    }
}