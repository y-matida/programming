/*
 * メソッドの定義と呼び出し
 * メソッドのメリット
 * ・可読性向上：特定の処理を1カ所にまとめることで、プログラムの効率化や可読性向上を実現する。
 * ・再利用可能：同じ処理を複数回書く必要がなくなり、ミスを減らせる。
 * ・保守性向上：修正箇所をメソッド内に限定でき、エラーを減らせる。
 * 
 * メソッドの定義
 * 戻り値の型 メソッド名（引数1の型 引数1名, 引数2の型 引数2名, ...）{
 *      //メソッドの処理
 *      return 戻り値;
 * }
 * ・戻り値の型：戻り値がない場合は void
 * ・メソッド名：処理内容がわかりやすい名前を付ける。名前は小文字から始まるのが基本
 * ・引数；メソッドに渡すデータ
 * ・return：処理の結果を呼び出し元に返す（戻り値がある場合）
 */

public class MethodSample {
    public static void main(String[] args) {
        //isPalindrome()メソッドに引数を渡して呼び出す
        isPalindrome("あいいあ");

        //引数はメソッドに渡すデータで、処理内容を柔軟に変更できる
        //greet()メソッドに、引数 "太郎" を渡して呼び出す
        greet("太郎");

        //複数の引数を渡す
        introduce("花子", 25);

        //引数の数が決まってない場合は、可変長引数（varargs）を使う
        add(1,2,3,4);
        add(1,2,3,4,5);

        //戻り値(return)は、メソッドの実行結果として呼び出し元に返される値
        int result = addReturn(3,5);
        System.out.println(result);
    }

    //戻り値がないため、void型のメソッドとなる
    public static void isPalindrome(String s){
        //引数 s を逆から並び替えた値を 変数 reversed に格納する
        String reversed = new StringBuilder(s).reverse().toString();
        //引数 s と、逆から並び変えた値 reversed が等しい場合は、回文である
        if(s.equals(reversed)){
            System.out.println("「" + s + "」は回文です。");
        }else{
            System.out.println("「" + s + "」は回文ではないです。");
        }
    }

    //受け取った引数により、表示内容が異なる
    public static void greet(String name){
        System.out.println("こんにちは、" + name + "さん！");
    }

    //複数の引数も処理できる
    public static void introduce(String name, int age){
        System.out.println("こんにちは、" + name + "さん！年齢は" + age + "歳です。");
    }

    //引数の数が決まっていないときは、可変長引数を使う
    public static void add(int... numbers){
        int sum = 0;
        for(int n: numbers){
            sum += n;
        }
        System.out.println("合計：" + sum);
    }

    //returnで戻り値を返す
    public static int addReturn(int a,int b){
        return a + b;
    }
}
