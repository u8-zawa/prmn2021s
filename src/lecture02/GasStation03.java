package lecture02;

public class GasStation03 {
    public static void refuel(Car03 car) {
        car.fuel += 20;
        System.out.println("給油したことによりfuelが" + car.fuel + "増えました。");
    }
}
