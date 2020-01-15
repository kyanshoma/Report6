package jp.ac.uryukyu.ie.e175773;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {
    public static int[] InputNumber(){
        /**
         * @param array:入力した数字を保存するための配列
         */
        int array[] = new int[3];

        /**
         * 数字の入力部。
         * 数字が重複していたり、指定以外の入力がされた場合は入力をやり直すように設定した。
         * @return int型の配列
         */
        for (int i = 0; i < array.length; i++) {
            Loop:
            while (true) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println((i + 1) + "番目の数値を入力して下さい");
                    array[i] = sc.nextInt();  //0~9の数値を入れる
                } catch (InputMismatchException e) {
                    System.out.println("入力が数値ではありません！");
                    System.out.println((i + 1) + "番目から入力し直して下さい！");
                    System.out.println();
                    continue Loop;
                }
                if (array[i] >= 10) {
                    System.out.println("数字が2桁以上です！" + (i + 1) + "番目から入力し直して下さい！");
                    continue Loop;
                }
                for (int j = 0; j < i; j++) {
                    //その前までの数値のどれかとかぶっていたら数値代入からやり直し
                    if (array[j] == array[i]) {
                        System.out.println("数字が重複しています！もう一度" + (i + 1) + "番目から入力し直して下さい！");
                        continue Loop;
                    }
                }
                break;
            }
        }
        return array;
    }
}
