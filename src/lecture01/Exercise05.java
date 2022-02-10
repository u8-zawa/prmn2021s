package lecture01;

public class Exercise05 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};
        for (int i = 0; i < score.length; i++) {
            if (100 >= score[i] && score[i] >= 90) {
                System.out.println(i + "番 " + score[i] + "点 秀");
            }else if (90 > score[i] && score[i] >= 80) {
                System.out.println(i + "番 " + score[i] + "点 優");
            }else if (80 > score[i] && score[i] >= 70) {
                System.out.println(i + "番 " + score[i] + "点 良");
            }else if (70 > score[i] && score[i] >= 60) {
                System.out.println(i + "番 " + score[i] + "点 可");
            }else {
                System.out.println(i + "番 " + score[i] + "点 不可");
            }
        }
        System.out.println(".....");
        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最低点:" + min(score) + "点");
        System.out.println("平均点:" + average(score) + "点");
        System.out.println(".....");
    }

    static int max(int[] score) {
        int maxScore = score[0];

        for (int i = 1; i < score.length; i++) {
            if (maxScore < score[i]) maxScore = score[i];
        }
        return maxScore;
    }

    static int min(int[] score) {
        int minScore = score[0];

        for (int i = 1; i < score.length; i++) {
            if (minScore > score[i]) minScore = score[i];
        }
        return minScore;
    }

    static double average(int[] score) {
        double ave;
        double sum = 0;

        for (int s : score) {
            sum += s;
        }
        ave = sum / (double) score.length;
        return ave;
    }
}
