// Create a class called Laptop with brand, model number, and price as instance variables.
// Use a static variable for a common discount rate.
// Write a constructor to set values and a method to calculate final price after applying the discount.
// Test the class by creating at least 2 laptop objects.

public class Laptop{
    String brand;
    int modelNumber;
    double price;
    static float discountRate;

    public Laptop(String brand, int modelNumber, double price){
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.price = price;
    }

    public void calculateFinalPrice(){
        double total = price - (price/discountRate);
        System.out.println("Total price comes to " + total);
    }

    public static void main(String args[]){
        discountRate = 5.5;

        Laptop l1 = new Laptop('M2', 23, 100000);
        Laptop l2 = new Laptop('TUF', 24, 73000);

        l1.calculateFinalPrice();
        l2.calculateFinalPrice();
    }
}