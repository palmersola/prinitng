package COCP;

public class Product {
    private String name;
    private double cost;
    private int quantity;

        public Product(String name, double cost, int quantity) {
            this.name = name;
            this.cost = cost;
            this.quantity = quantity;
        }

        public double totalCost() {
            return this.cost * this.quantity;
        }

        public void printProduct() {
            System.out.println(this.name + " costs " + this.cost + " and " + this.quantity + " units were purchased.");
            System.out.println("Total cost is: " + totalCost());
        }
}
