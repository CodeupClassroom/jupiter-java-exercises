package inheritanceLecture.AutoShop;

import java.util.ArrayList;

public class Technician {
    private String name;

    public Technician(String name){
        this.name = name;
    }

    public Car repair(Car theCar){
        System.out.println("Repairing the car...");
        return theCar;
    }

    public static void main(String[] args) {
        Technician Bob = new Technician("Bob");

//        Assume that Bob can repair any type of Car. Demonstrate this with Polymorphism.

        Car toyota = new Toyota();
        Car ford = new Ford();
        Car chevy = new Chevy();


        Bob.repair(toyota);
        toyota.drive();

        Bob.repair(ford);
        Bob.repair(chevy);

        ArrayList<Car> cars = new ArrayList<>();
    }
}
