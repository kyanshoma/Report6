package jp.ac.uryukyu.ie.e175773;

class RankJudgement {
    void rankJudgement(int count){
        System.out.println("正解です！");
        System.out.println(count+"回目でクリアしました");
        if(count==1){
            System.out.println("1発クリア！正解率0.2%！！！素晴らしいです！");
        }
        else if(count>=2 && count<=3){
            System.out.println("いいですね！次は1発クリアを目指しましょう！(えっキツい？)");
        }
        else if(count>3 && count<=7){
            System.out.println("まあまあですね！もう少し精度を上げましょう！");
        }
        else{
            System.out.println("まだまだですね！頑張りましょう！");
        }
    }
}
