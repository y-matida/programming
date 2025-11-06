/*
 * 配列
 * 「同じ型の複数の値」を、1つの変数で管理するデータ構造
 * ・データ管理の効率化
 * ・インデックスによるアクセス
 * ・ループ処理と相性が良い
 * 
 * 書き方
 * var 配列名 = new 型[要素数]
 * var numbers = new int[5];
 */


public class ArraySample {
    public static void main(String[] args) {
        //配列の定義 要素数 5 int型
        //配列は参照型であるためnewキーワードで初期化
        var numbers = new int[5];

        for (var i = 0; i < numbers.length; i++){
            numbers[i] = i*2;   //配列の各要素に値を代入
        }
        //配列の各要素を表示
        for(var i = 0;i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
