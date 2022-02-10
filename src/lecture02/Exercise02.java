package lecture02;

public class Exercise02 {
    public static void main(String[] args) {
        Car02 car = new Car02();

        car.run();
        GasStation02.refuel(car);
        car.run();
    }
}
