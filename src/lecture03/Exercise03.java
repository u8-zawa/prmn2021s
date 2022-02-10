package lecture03;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1つ目の整数を入力してください:");
        String input_x = scanner.nextLine();
        int x = Integer.parseInt(input_x);

        System.out.println("2つ目の整数を入力してください:");
        String input_y = scanner.nextLine();
        int y = Integer.parseInt(input_y);

        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }
}
