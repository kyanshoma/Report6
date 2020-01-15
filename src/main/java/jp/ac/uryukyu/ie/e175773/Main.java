package jp.ac.uryukyu.ie.e175773;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int count=0;
        int[] answer;

        answer = MakeAnswerNumber.MakeAnswerNumber();

        System.out.println("〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜数当てゲーム〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜");
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
            array= InputNumber.InputNumber();
            System.out.println();
            System.out.println(count+"回目の入力:"+Arrays.toString(array));

            int eat_number = 0;

            eat_number = new NumberComparison().numberComparison(answer,array);

            if(eat_number==array.length){
                    RankJudgement r1 = new RankJudgement();
                    r1.rankJudgement(count);
                    break;
            }

        }
    }
}