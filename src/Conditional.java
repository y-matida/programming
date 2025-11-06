/*
 * 条件分岐
 * ・if文
 * ・if-else文
 * ・if-else if-else文
 * ・三項演算子 短い条件分岐で使用（書式：変数 = (条件式) ? trueの時の値：falseのときの値;）
 * ・switch文
 */

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //Scannerクラスで、キーボード入力やファイルからデータを読み取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("点数を入力してください：");
        int score = scanner.nextInt();
        
        //if文 条件式がtrueなら処理を実行する
        if(score >= 90){
            System.out.println("良です");
        }
        //else if文 複数の条件式を判定する 
        else if (score >= 60){
            System.out.println("可です");
        }
        //else文 すべての条件式がfalseの時の処理を記述する
        else {
            System.out.println("不可です");
        }

        //短い条件分岐には三項演算子が便利
        //書式：変数 = (条件式) ? trueの時の値：falseのときの値;
        String result = (score >= 60) ? "合格" : "不合格";
        System.out.println(result);

        System.out.println("処理を終了します");
        scanner.close();

        //switch文 複数の条件（値の一致）で処理を分岐したい場合に使える
        //通常のswitch文
        //breakを記述しないと、次のケースにも処理が流れる（フォールスルー）
        //defaultはどのcaseにも一致しないときの処理
        int grade = 2;
        switch (grade) {
            case 1:
                System.out.println("1年生です");
                break;
            case 2:
                System.out.println("2年生です");
                break;
            case 3:
                System.out.println("3年生です");
                break;
            case 4:
                System.out.println("4年生です");
                break;
            default:
                System.out.println("該当なし");
                break;
        }

        //拡張switch文 （Java14以降使用可能）
        //->を用いることで簡潔に書ける
        //breakが不要
        String message = switch(grade){
            case 1 -> "1年生です";
            case 2 -> "2年生です";
            case 3 -> "3年生です";
            default -> "該当なし";
        };
        System.out.println(message);
        

    }
}
