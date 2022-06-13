package kazuate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInput {

    /**
     * ユーザに整数を1つ入力してもらい，返り値として返す．
     * 正しい入力が得られるまで繰り返す．
     *
     */
    static public int inputNumber() {
        int number;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            number = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.err.println("フォーマット例外です．もう一度．");
            number = inputNumber(); // 再起呼び出し
        } catch (IOException e) {
            System.err.println("入出力例外です．もう一度．");
            number = inputNumber(); // 再起呼び出し
        }

        return number;
    }

    /**
     * ユーザに文字列を入力してもらい, 返り値として返す.
     * 正しい入力が得られるまで繰り返す.
     */
    static public String inputString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.err.println("入出力例外です．もう一度．");
            line = inputString(); // 再起呼び出し
        }
        return line;
    }

    /**
     * ユーザのEnterキー入力があるまで待機する．
     */
    static public void waitEnter() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enterキーの入力で次に進みます");
            br.readLine();
        } catch (IOException e) {

        }
    }

}
