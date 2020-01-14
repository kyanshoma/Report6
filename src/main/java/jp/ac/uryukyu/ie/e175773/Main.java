package jp.ac.uryukyu.ie.e175773;
import java.lang.Math;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args){
        int count=0;
        int[] answer = new int[3];
        for(int i = 0; i < answer.length; i++){
            Loop: while(true){
                answer[i] = (int)(Math.random() * 10);  //0~9の数値を入れる
                for(int j = 0; j < i; j++){
                    //その前までの数値のどれかとかぶっていたら数値代入からやり直し
                    if(answer[j] == answer[i]) continue Loop;
                }
                break;
            }
        }
        while (true) {
            count++;
            // 4つずつ数値を入力する。当たるまで繰り返す
            System.out.println("3つの異なる10進数を一つずつ入力して下さい");
            System.out.println("-------------"+count+"回目の入力-------------------");
            Scanner sc = new Scanner(System.in);
            int array[] = new int[3];
            for (int i = 0; i < array.length; i++) {
                Loop:
                while (true) {
                    System.out.println((i + 1) + "番目の数値を入力して下さい");
                    array[i] = sc.nextInt();  //0~9の数値を入れる
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
            System.out.println();
            System.out.println(count+"回目の入力:"+Arrays.toString(array));

            int eat_number = 0;
            int bite_number = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == answer[j] && i == j) {
                        eat_number = eat_number + 1;
                    }
                    if (array[i] == answer[j]) {
                        bite_number = bite_number + 1;
                    }
                }
            }
            System.out.println("数字も場所も一致(EAT): " + eat_number);
            System.out.println("数字のみ一致(BITE): " + bite_number);
            System.out.println();
            if(eat_number==array.length){
                    System.out.println("正解です！");
                    System.out.println(count+"回目でクリアしました");
                    break;
            }
        }
    }
}