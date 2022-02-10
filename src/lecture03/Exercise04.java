package lecture03;

import java.util.ArrayList;

public class Exercise04 {
    public static void main(String[] args) {
        ArrayList<Vegetable> list = new ArrayList<>();

        list.add(new Vegetable("にんじん", 117));
        list.add(new Vegetable("たまねぎ", 120));
        list.add(new Vegetable("じゃがいも", 154));

        for (Vegetable vegetable : list) {
            vegetable.print();
        }
    }
}
