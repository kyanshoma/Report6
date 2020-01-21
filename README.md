# 課題レポート6（数当てゲームの実装）

## 概要
3桁の異なる数字と順番を当てるゲームを作成した。

## ルール説明
1. ランダムで用意したそれぞれ異なる3つの数字とそれぞれの順番を当てるゲーム。数字だけ全部当たっていても順番が異なっているとクリアできない。
2. 数字は0~9の10進数で1番目から順番に入力する。
3. それぞれ異なる数字なので「3」「3」「4」などの一つでも重複する数字は入力できない。
4. 入力した数字とランダムで用意した数字を比較していく。<br>
    数字と順番両方とも一致している個数(EAT)と数字のみが一致している個数(BITE)を表示する。<br>
    (例)ランダムで用意された数字「3」「4」「5」に対して入力「1」「4」「3」だと、EAT:1-BITE:2となる。
5. EAT:3 になればクリア

## 必要な要素
- 3つの異なる乱数を生成するメソッド<br>
[MakeAnswerNumber.java](https://github.com/kyanshoma/Report6/blob/master/src/main/java/jp/ac/uryukyu/ie/e175773/MakeAnswerNumber.java)  
  
- 数値を入力するためのメソッド<br>
[InputNumber.java](https://github.com/kyanshoma/Report6/blob/master/src/main/java/jp/ac/uryukyu/ie/e175773/InputNumber.java)  

- 入力した数値とランダムで用意した数値を比較するためのメソッド
[NumberComparison.java](https://github.com/kyanshoma/Report6/blob/master/src/main/java/jp/ac/uryukyu/ie/e175773/NumberComparison.java)


