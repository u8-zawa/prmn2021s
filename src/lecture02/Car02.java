package lecture02;

public class Car02 {
    int fuel;

    public Car02() {
        this.fuel = 0;
    }

    public void run() {
        if (fuel > 0) {
            fuel -= 1;
            System.out.println("燃料を1消費して走りました。");
        } else {
            System.out.println("燃料が足りないため走れませんでした。");
        }
    }
}
