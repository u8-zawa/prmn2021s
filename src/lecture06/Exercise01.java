package lecture06;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("小数値を入力してください:");

        try { // 例外(Exception)が発生する可能性のある処理
            Scanner scanner = new Scanner(System.in);
            double number = scanner.nextDouble(); // 64bit浮動小数点値を、変数inputに代入
            System.out.println("入力した値:  " + number);
        } catch (Exception e) { // 例外処理
            System.out.println("エラー.");
        }

    }
}
