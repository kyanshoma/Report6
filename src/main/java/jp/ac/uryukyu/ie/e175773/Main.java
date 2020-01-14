package jp.ac.uryukyu.ie.e175773;
import java.lang.Math;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args){
        int count=0;
        int[] answer = new int[3];

        // 乱数生成
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

        System.out.println("〜〜〜〜〜〜〜〜数当てゲーム〜〜〜〜〜〜〜〜〜〜");
        System.out.println("ルール説明");
        System.out.println("1. ランダムで用意したそれぞれ異なる3つの数字とそれぞれの順番を当てるゲームです。数字だけ全部当たっていても順番が異なっているとクリアできません。");
        System.out.println("2. 数字は0~9の10進数で1番目から順番に入力します。例：「345」などまとめて入れることは不可能です。「3」「4」「5」と入力していきましょう。");
        System.out.println("3. それぞれ異なる数字なので「3」「3」「4」などの一つでも重複する数字は入力できません");
        System.out.println("4. 入力した数字とランダムで用意した数字を比較していきます。");
        System.out.println("　　数字と順番両方とも一致している個数(EAT)と数字のみが一致している個数(BITE)を表示します。");
        System.out.println("　　例：ランダムで用意された数字「3」「4」「5」に対して入力「1」「4」「3」だと、EAT:1-BITE:2となります。");
        System.out.println("5. EAT:3 になればクリアです。");
        System.out.println("それではプレイしていきましょう！めざせ１発クリア！(キツい)");
        System.out.println();
        //数が当たるまで入力を繰り返す
        while (true) {
            count++;
            // 4つずつ数値を入力する。当たるまで繰り返す
            System.out.println("3つの異なる10進数を一つずつ入力して下さい");
            System.out.println("-------------"+count+"回目の入力-------------------");
            int array[] = new int[3];
            for (int i = 0; i < array.length; i++) {
                Loop:
                while (true) {
                        try{
                            Scanner sc = new Scanner(System.in);
                            System.out.println((i + 1) + "番目の数値を入力して下さい");
                            array[i] = sc.nextInt();  //0~9の数値を入れる
                        }catch(InputMismatchException e){
                            System.out.println("入力が数値ではありません！");
                            System.out.println((i + 1) + "番目から入力し直して下さい！");
                            System.out.println();
                            continue Loop;
                        }
                    if (array[i]>=10){
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
            System.out.println("EAT (数字と順番両方とも一致している個数): " + eat_number);
            System.out.println("BITE(数字のみが一致している個数)       : " + bite_number);
            System.out.println();
            if(eat_number==array.length){
                    System.out.println("正解です！");
                    System.out.println(count+"回目でクリアしました");
                    if(count==1){
                        System.out.println("1発クリア！正解率0.2%！！！素晴らしいです！");
                    }
                    else if(count>2 && count<=3){
                        System.out.println("いいですね！次は1発クリアを目指しましょう！(えっキツい？)");
                    }
                    else if(count>3 && count<=7){
                        System.out.println("まあまあですね！もう少し精度を上げましょう！");
                    }
                    else{
                        System.out.println("まだまだですね！頑張りましょう！");
                    }
                    break;
            }
        }
    }
}