/*
 * パッケージ
 * クラスや機能を整理・再利用するするために、パッケージ(package)を使用する。
 * パッケージやクラスを使用するにはimportを使用する。
 * 
 * クラス       ：メソッドやフィールド（変数）を含む定義
 * パッケージ   ：関連するクラスをまとめた名前空間。Javaのファイル構成単位（ディレクトリ）
 * ライブラリ   ：クラスやメソッドが集まった機能群。
 *                  ・標準ライブラリ：Javaに最初から含まれる
 *                  ・外部ライブラリ：MavenやGradleなどで追加する
 */

//Java.langパッケージのMathクラスをインポート
//なお、Java.langパッケージは自動でインポートされるため、明示せずとも、Math, String, Systemなどは使える
import java.lang.Math;
//Java.utilパッケージのDateクラスをインポート
import java.util.Date;
//* を使用することで、パッケージ内すべてをインポートできる（非推奨）
//java.util.*

public class PackageSample {
    public static void main(String[] args) {
        //インポートしたMathクラスのsqrt()メソッドを使用、引数の正の平方根を求める
        System.out.println(Math.sqrt(16));  // 4

        //クラス型 変数名 ＝ new クラス名()
        //Dateクラスのオブジェクトを作成（インスタンス化）し、変数 now に格納
        Date now = new Date();
        System.out.println(now);
    }
}
