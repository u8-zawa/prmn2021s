package lecture02;

public class GasStation02 {
    public static void refuel(Car02 car) {
        int fuel = 20;
        car.fuel += fuel;
        System.out.println("給油したことによりfuelが" + fuel + "増えました。");
    }
}
