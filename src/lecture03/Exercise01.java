package lecture03;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("任意の文字列を入力してください: ");
        String input = scanner.nextLine();
        System.out.println("“" + input + "” と入力されました");
    }
}
