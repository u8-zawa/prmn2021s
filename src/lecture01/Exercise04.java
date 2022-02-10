package lecture01;

public class Exercise04 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum;

        for (int i = 0; i < array.length; i++) {
            // 要素番号+1の値を代入
            array[i] = i + 1;
        }

        // パターン1
        sum = 0;
        for (int j = 0; j < array.length; j+=2) {
            // 配列番号が偶数の値を足し合わせる
            sum += array[j];
        }
        System.out.println("パターン1: " + sum);

        // パターン2
        sum = 0;
        for (int j = 0; j < array.length; j++) {
            // 配列番号が偶数の値を足し合わせる
            if(j % 2 == 0) {
                sum += array[j];
            }
        }
        System.out.println("パターン2: " + sum);
    }
}
