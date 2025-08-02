package nittan.oops.multipleInheritance;

public class FlyingCar implements Drivable, Flyable {
    String brand;
    public FlyingCar(String brand) {
        this.brand = brand;
    }

    @Override
    public void drive() {
        System.out.println("Driving " + brand);
    }

    @Override
    public void fly() {
        System.out.println("Flying " + brand);
    }

}
