package nittan.oops.multipleInheritance;


// Grandparent Interface
interface Vehicle {
    void goForward();

    default void startEngine() {
        System.out.println("Vehicle's engine starts with a generic sound.");
    }
}

// Parent Interface 1
interface Car extends Vehicle {
    @Override
    default void startEngine() {
        System.out.println("Car's engine starts with a 'Vroom!'");
    }
}

// Parent Interface 2
interface Boat extends Vehicle {
    @Override
    default void startEngine() {
        System.out.println("Boat's engine starts with a 'Chug-chug-chug!'");
    }
}

class UnknownVehicle implements Car, Boat {
    private String name;

    public UnknownVehicle(String name) {
        this.name = name;
    }

    // This method is required by the Vehicle interface
    @Override
    public void goForward() {
        System.out.println(name + " is moving forward.");
    }

    // We must explicitly choose which default method to use
    // or provide a new implementation.
    @Override
    public void startEngine() {
        // You can choose to call one or both parent methods
        Car.super.startEngine(); // This will call the Car's default method
        System.out.println(name + " is ready for its journey.");
    }
}