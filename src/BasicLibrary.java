/*
 * 標準ライブラリの活用
 * ・Mathクラス：数学計算用のメソッドを提供 
 * ・Date / LocalDateTimeクラス：日付や時刻を扱う 
 * ・Randomクラス ：ランダムな値を計算する
 * ・File / Files / Paths クラス（java.io / java.nio）：ファイルやディレクトリを操作する
 * ・HttpURLConnectionクラス：Webからデータを取得する
 */

//日付や時刻を扱うパッケージ、クラス
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//ランダムな値を生成するためのパッケージ、クラス
import java.util.Random;
import java.util.Arrays;

//ファイルやディレクトリを操作するためのパッケージ、クラス
import java.io.File;
import java.io.IOException;

//Webからデータを取得するためのパッケージ、クラス
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;

public class BasicLibrary {
    public static void main(String[] args)  throws IOException,Throwable{

        //計算処理系
        exampleMath();

        //日付処理系
        exampleDate();

        //ランダムな値の処理系
        exampleRamd();

        //ファイル管理系
        exampleFile();

        //Webからのデータ取得
        exampleHttp();
    }

    public static void exampleMath(){
        //Math.sqrt(引数)：引数の正の平方根を求める
        System.out.println(Math.sqrt(25));  // 5.0
        
        //Math.exp(引数)：自然対数の底 e の引数乗を求める
        System.out.println(Math.exp(1));    //2.71828...
        
        //Math.PI：円周率
        System.out.println(Math.PI);           // 円周率 3.14...
    }

    public static void exampleDate(){

        //現在の日時を取得
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);    // 2025-11-04T15:08:06.232237500

        //引数に指定した日時を取得
        LocalDate birthday = LocalDate.of(1995,5,17);
        System.out.println(birthday);   //1995-05-17

        //二つの日時の差を取得
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 1, 1);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(daysBetween);    //365
    }

    public static void exampleRamd(){

        //ランダムな値を生成する
        //Random型のオブジェクトをインスタンス化
        Random rand = new Random();
        //1～10のランダム整数
        System.out.println(rand.nextInt(10) + 1);

        //配列を用意
        int[] arr = {1,2,3,4,5};
        //配列の中身をランダムにシャッフルする
        shuffleArray(arr);
        //シャッフルされた配列を表示する
        System.out.println(Arrays.toString(arr));
        
        //選択する要素をランダムに決定する
        int choice = arr[rand.nextInt(arr.length)];
        System.out.println("選ばれた要素：" + choice);

    }

    //引数に与えられた配列の並びをシャッフルするメソッド
    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for(int i = array.length - 1; i > 0; i--){
            int index = rand.nextInt(i+1);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static void exampleFile() throws IOException{
        //ファイル操作
        //現在の作業ディレクトリのパスを取得する
        File current = new File(".");
        System.out.println(current.getCanonicalPath());

        //新しいディレクトリを作成する
        File newDir = new File("new_folder");
        //"new_folder"ディレクトリが存在しないとき
        if(!newDir.exists()){
            //"new_folder"ディレクトリを作成する
            newDir.mkdir();
            System.out.println("フォルダ作成：" + newDir.getName());
        }

        //ファイルの有無を確認する
        File example = new File("example.txt");
        System.out.println("example.txtの存在：" + example.exists());   //false

    }

    
    public static void exampleHttp() throws Throwable{  //throws Throwableですべての例外、エラーをスローする 非推奨
        //URLクラスのインスタンスを生成。
        //URIクラスのコンストラクタを使用して、引数の文字列を解析しURIを構築、toURL()メソッドでURLを構築
        URL url = new URI("https://news.google.com/home?hl=ja&gl=JP&ceid=JP:ja").toURL();
        
        //HttpURLConnectionクラスのインスタンスを生成
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //生成した変数 conn を使用してリクエストメソッドを指定（今回はGET）
        conn.setRequestMethod("GET");

        //バイトストリームを文字列ストリームにし、読み込みバッファを使用し効率よく読み込めるようにする。
        //・conn.getInputStream() HTTP接続からレスポンスのバイトストリームを取得
        //・new InputStreamReader() バイトストリームを文字列ストリームに変換
        //・new BufferedReader() 読み込み効率を高めるために、バッファリングされたリーダを使用し、ある程度まとめて読み込み
        //・StringBuilder content = new StringBuilder(); 読み込んだ文字列を効率よく連結するために使用。Stringの連結よりもパフォーマンスが良い
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder content = new StringBuilder();

        //レスポンスを一行ずつ読み取る
        while((line = in.readLine()) != null){
            content.append(line);
        }

        //通信を切断する
        in.close();
        conn.disconnect();

        //取得したHTMLを表示する
        //substring(開始位置,終了位置)なので、HTMLは最初から500文字までを表示する
        System.out.println(content.substring(0,Math.min(500,content.length())));
    }

        


        
        
    }
