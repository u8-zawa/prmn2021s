package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        int number = scanner.nextInt(); scanner.nextLine();
        // nextInt()で数値を読み取ると改行コードが残ってしまうため、nextLine()で空読みする

        for(int i = 0; i < number; i++) {
            System.out.print(i+1 + "行目:");
            String input = scanner.nextLine();
            list.add(input);
        }

        System.out.println("入力した文字列:");
        for(String str : list) { // listの要素を一つずつstrに取り出す。
            System.out.println("[" + list.indexOf(str) + "] " + str);
        }
    }
}
