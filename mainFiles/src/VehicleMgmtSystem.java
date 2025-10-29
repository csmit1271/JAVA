// Design a vehicle management system using an abstract class to represent the common structure of different vehicle types.

// Description:
// Create an abstract class Vehicle with common properties and methods like:

// String brand

// String model

// abstract void start()

// abstract void stop()

// Then create subclasses such as:

// 1)Car

// 2)Bike
abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void start();
    public abstract void stop();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

class Car extends Vehicle {

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Car " + brand + " " + model + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car " + brand + " " + model + " is stopping.");
    }
}

class Bike extends Vehicle {

    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Bike " + brand + " " + model + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike " + brand + " " + model + " is stopping.");
    }
}

public class VehicleMgmtSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW", "M8");
        Vehicle car2 = new Car("Tata", "Punch");
        Vehicle bike = new Bike("Royal Enfield", "Classic");

        car.displayInfo();
        car.start();
        car.stop();

        System.out.println();

        car2.displayInfo();
        car2.start();
        car2.stop();

        System.out.println();

        bike.displayInfo();
        bike.start();
        bike.stop();
    }
}