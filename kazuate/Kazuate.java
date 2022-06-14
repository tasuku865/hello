package kazuate;

import java.util.Random;

public class Kazuate {
    public static void main(String[] args) {
        Random r = new Random();
        int ans = r.nextInt(90) + 10;

        for (int i = 0; i < 5; i++) {
            System.out.println("2桁の整数を入力してください");
            int input = KeyBoardInput.inputNumber();
            if (input == ans) {
                System.out.println("当たりです");
                break;
            } else if (input > ans) {
                System.out.println("入力は答えより大きいです");
            } else {
                System.out.println("入力は答えより小さいです");
            }

            if (Math.abs(input - ans) > 20) {
                System.out.println("入力は答えと20以上差があります");
            }

            System.out.println("入力は残り" + (4 - i) + "回です");
        }

        System.out.println("終了します");

    }
}