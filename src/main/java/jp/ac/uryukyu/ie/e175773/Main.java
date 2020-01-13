package jp.ac.uryukyu.ie.e175773;
import java.lang.Math;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] answer = new int[4];
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
        System.out.println(Arrays.toString(answer));

        // 4つずつ数値を入力する
        System.out.println("4つの異なる10進数を一つずつ入力して下さい");
        Scanner sc = new Scanner(System.in);
        int array[] = new int[4];
        for(int i=0; i<array.length; i++) {
            Loop: while(true) {
                System.out.println((i+1)+"番目の数値を入力して下さい");
                array[i] = sc.nextInt();  //0~9の数値を入れる
                for (int j = 0; j < i; j++) {
                    //その前までの数値のどれかとかぶっていたら数値代入からやり直し
                    if (array[j] == array[i]) {
                        System.out.println("数字が重複しています！もう一度"+(i+1)+"番目から入力し直して下さい！");
                        continue Loop;
                    }
                }
                break;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));

        int eat_number=0;
        int bite_number=0;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++){
                if(array[i] == answer[j] && i==j){eat_number=eat_number+1;}
                if(array[i] == answer[j]){bite_number=bite_number+1;}
            }
        }
        System.out.println("数字も場所も一致: "+eat_number);
        System.out.println("数字のみ一致: "+bite_number);
    }
}