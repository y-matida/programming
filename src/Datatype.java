/* 
 *  Javaの基本的なデータ型
 * ・整数型     : int(整数), double(倍精度小数), float(単精度小数), long(長整数), short(短整数), byte(バイト)
 * ・文字型     : char(1文字)
 * ・ブール型   : boolean(真/偽)
 * ・参照型     : String(文字列), null(何も参照していない)
 */

public class Datatype {
    public static void main(String[] args) {
        //整数型 int : 32ビットの範囲で整数を扱う（-2,147,483,648 ~ 2,147,483,647）
        int a = 10;
        int b = -5;
        //int c = 0;
        System.out.println(a + b); // 5

        //整数同士の割り算は小数点以下が切り捨てられる
        System.out.println(10/3); //3
        System.out.println(10/3.0); //3.3333...

        //浮動小数点 double / float : 小数を扱う doubleは64ビット精度、floatは32ビット制御
        //通常はdoudle型を使用する
        //double x = 3.14;
        double y = 0.1 + 0.2;
        System.out.println(y); // 0.30000000000000004

        //型変換
        //整数 → 小数 キャストを利用しなくても、自動的に変換される
        //double d = (double) 10;
        //小数 → 整数 明示的なキャストが必要で、小数点以下は切り捨てられる
        //int i = (int) 3.99; //3

        //文字列型 String：テキストデータを扱う
        String text = "Hello,world!";
        System.out.println(text);

        //文字列操作
        //結合 "Hello," + "World!" → 'Hello,World!'
        String text_join = "Hello," + "World?";
        System.out.println(text_join);

        //繰り返し repeat()メソッドがJava11以降で使用できる
        System.out.println("Hi! ".repeat(3)); //Hi! Hi! Hi!

        //文字列長さ（文字数）取得
        System.out.println("Hello".length()); // 5

        //文字列メソッド 大文字 小文字
        String text_Case_UL = "java";
        System.out.println(text_Case_UL.toUpperCase()); // 'JAVA'
        System.out.println(text_Case_UL.toLowerCase()); // 'java'

        //ブール型 boolean ： true(真)かfalse(偽)を表す
        //条件式の評価結果はすべてboolean型になる
        int aa = 5;
        int bb = 10;
        System.out.println(aa < bb); //true
        System.out.println(aa == bb); //false

        //null参照  null 「何も参照していない状態」を表す
        //nullにアクセスしようとするとNullPointerExceptionが発生する
        String name = null;
        System.out.println(name);

    }
}
