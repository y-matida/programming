/*
 * Javaの標準メソッド
 * ・System.out.println()：画面への出力
 * ・length()：データの長さ（文字列の長さ、配列の長さ）を返す
 * ・instanceof：オブジェクトの型確認、指定の型と一致するか
 * ・getClass().getName()：型名を取得する
 * ・Math.max()：最大値の取得
 * ・Math.min()：最小値の取得
 * ・Arrays.sort()：配列の並べ替え
 * ・Math.abs()：絶対値を求める
 */

import java.util.Arrays;

public class BasicMethod {
    public static void main(String[] args) {
        
        //System.out.println()：画面への出力
        System.out.println("Hello.world");

        //length()：データの長さ（文字列の長さ）を返す
        String str = "java";
        System.out.println(str.length());

        //length()：データの長さ（配列の長さ）を返す
        int[] numbers = {1,2,3,4};
        System.out.println(numbers.length); // 4

        //型の確認
        //instanceof：オブジェクトの型確認、指定の型と一致するか
        //getClass().getName()：型名を取得する
        Object data = "Hello";
        System.out.println(data instanceof String);     //true
        System.out.println(data.getClass().getName());  //java.lang.String

        //最大・最小値の取得
        //Math.max()：最大値の取得
        //5と10、どちらが大きいか
        System.out.println(Math.max(5,10));     //10

        //Math.min()：最小値の取得
        //配列内の最小値を求める
        int[] values = {1,2,3,4};
        int min = values[0];
        for(int v : values){
            min = Math.min(min,v);
        }
        System.out.println(min);    // 1

        //Arrays.sort()：配列の並べ替え
        int[] arr = {5,2,8,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   //[1,2,5,8]

        //Math.abs()：絶対値を求める
        System.out.println(Math.abs(-10));  // 10

    }
}
