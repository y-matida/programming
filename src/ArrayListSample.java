/*
 * コレクション List, Map, Set, Queue
 * 配列と同様に、同じ型の複数の値を１つの変数で管理するデータ構造
 * 
 * 配列と異なる点
 * ・サイズが変更可能：配列は固定サイズだが、コレクションは動的にサイズが変更できる
 * ・機能性：コレクションは配列よりも多くの便利な操作を提供する
 * 
 * メリット
 * ・柔軟性：サイズが動的に変更でき、さまざまなデータ構造を提供する
 * ・機能豊富：ソート・検索・挿入・削除などの操作が容易
 * ・型安全性：ジェネリクスを使用することで、型安全性が向上
 * 
 * 書き方
 * インターフェース<要素の型> コレクション名 = new 具象クラス<>();
 * List<String> list = new ArrayList<>();
 */

 /*
  * ArrayList （インターフェース List）
  * ・順序付けられたコレクション
  * ・要素をインデックスでアクセス可能。
  * ・重複を許容
  * 活用シーン
  * ・順序を保持する必要がある場合
  * ・要素をインデックスで管理したい場合
  */

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        List<String> places = new ArrayList<>();

        //要素の追加
        places.add("アイスランド");
        places.add("ドイツ");
        places.add("アメリカ");

        //要素の取得
        String firstItem = places.get(0); //最初の要素を取得
        System.out.println("1番目の要素（置換前）：" + firstItem);

        //要素の変更
        places.set(0, "スウェーデン"); //最初の要素を置換
        System.out.println("1番目の要素（置換後）：" + places.get(0));

        //要素の削除
        System.out.println("2番目の要素（削除前）：" + places.get(1));
        places.remove(1); //2番目の要素を削除

        //拡張forループによる取得
        System.out.println("拡張forループによる取得");
        for(String place : places){
            System.out.println(place);
        }

        //forEachとラムダ式による取得
        System.out.println("forEachとラムダ式による取得：");
        places.forEach((place) -> System.out.println(place));

        //サイズの取得
        int size = places.size(); //リストのサイズを取得
        System.out.println("リストのサイズ（クリア前）：" + size);
        places.clear();
        System.out.println("リストのサイズ（クリア後）：" + places.size());
    }
}
