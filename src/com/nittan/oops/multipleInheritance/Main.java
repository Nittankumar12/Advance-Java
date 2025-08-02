package nittan.oops.multipleInheritance;

public class Main {
    public static void main(String[] args) {
        // flying car drived from both interfaces
        FlyingCar flyingCar = new FlyingCar("Tesla");
        flyingCar.drive();
        flyingCar.fly();
        //
        UnknownVehicle unknownVehicle = new UnknownVehicle("Alto");
        unknownVehicle.startEngine();
        unknownVehicle.goForward();

    }
}
