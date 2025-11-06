/*
 * Java 動作確認
*/

public class Basic{
    public static void main(String[] args){
        //各教科の点数を変数として定義
        int japanese = 85;
        int math = 90;
        int english = 75;

        //平均点を計算（小数となるためdouble型で計算）
        double average = (japanese + math + english) / 3.0;

        //結果を表示
        System.out.println("3教科の平均点は" + average + "点です。");
    }
}