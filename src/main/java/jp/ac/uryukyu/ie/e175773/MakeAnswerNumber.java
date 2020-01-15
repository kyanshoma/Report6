package jp.ac.uryukyu.ie.e175773;

public class MakeAnswerNumber {
    public static int[] MakeAnswerNumber(){
        int[] answer = new int[3];

        // 乱数生成
        for(int i = 0; i < answer.length; i++) {
            Loop:
            while (true) {
                answer[i] = (int) (Math.random() * 10);  //0~9の数値を入れる
                for (int j = 0; j < i; j++) {
                    //その前までの数値のどれかとかぶっていたら数値代入からやり直し
                    if (answer[j] == answer[i]) continue Loop;
                }
                break;
            }
        }
        return answer;
    }
}
