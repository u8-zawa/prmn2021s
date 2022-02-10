package lecture06;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise02 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        // list内に1~6の乱数を入れる
        list.add(random.nextInt(6) + 1);
        list.add(random.nextInt(6) + 1);
        list.add(random.nextInt(6) + 1);
        list.add(random.nextInt(6) + 1);
        list.add(random.nextInt(6) + 1);

        System.out.println("さいころを5つ振りました。");
        System.out.println("何番目のさいころの値を確認しますか？");

        try {
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt(); scanner.nextLine();
            System.out.println(index + "番目のさいころ： " + list.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        } catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました。"); // -2147483648 ~ 2147483647の間以外の値も
            System.out.println("プログラムを終了します.");
        }

    }
}
