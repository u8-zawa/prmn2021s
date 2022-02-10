package lecture02;

public class Exercise03 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        for(int i = 0; i < tires.length; i++){
            tires[i] = new Tire(65);
        }
        Engine engine = new Engine(4000);
        Car03 car = new Car03(tires, engine);

        GasStation03.refuel(car);
        car.startEngine();
        car.run();
    }
}
