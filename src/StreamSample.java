/*
 * Streamの活用
 * Streamを使用することで、配列やコレクションを簡潔かつ効率的に処理するメソッドを提供するクラス
 * 
 * メリット
 * 簡潔：
 * ・Streamには、配列やコレクションに対してよく行う処理があらかじめメソッドとして用意されている。
 * ・複雑な処理でも1～数行で記載できる。
 * 読みやすく、保守性の高いコードを記述できる：
 * ・Streamを使用することで、コードがより宣言的になり、何を行っているのかが明確になる。
 * パフォーマンスの向上：
 * ・Streamは「遅延評価（実際に必要になるまで計算を行わない）」で動作するため、ムダが少なくパフォーマンスも向上する。
 * ・並列処理を行う仕組みも用意されており、現代の高速なコンピュータの利点を活かすことができる。
 * 
 * Streamの基本
 * Streamの生成：
 * ・Streamは、コレクションや配列などのデータソースから生成する。
 * ・例えば、collection.stream()と書くことで、collectionのストリームを生成できる。
 * 中間操作：
 * ・Streamでは、フィルタリング（filter）、変換（map）、ソート（sorted）などの中間操作が提供されている。
 * ・これらの操作は、Stream自体を変更せず、新しいStreamを生成する。
 * ・「.」で複数の中間操作をつなげて行うことも可能
 * 終端操作：
 * ・Streamから最終的な結果を取り出す操作
 * ・終端操作にはforEach、collect、reduceなどがある。
 * ・これらは「各要素に対するアクションの実行」や「別のリストなどの生成」を行う。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
    public static void main(String[] args) {
        List<String> places = new ArrayList<>();

        //要素の追加
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");

        //forEachを使った単純な出力
        //forEach：各要素に対してアクションを実行する
        System.out.println("◆Stream forEachによる取得：");
        places.stream().forEach(place -> System.out.println(place));

        //filterを使って特定の条件に一致する要素のみを抽出
        //filter：特定の条件に一致する要素だけを抽出する
        System.out.println("◆「ン」で終わる場所のみ抽出");
        places.stream()
                .filter(place -> place.endsWith("ン"))
                .forEach(place -> System.out.println(place));
        
        //mapを使って各要素を加工
        //map：各要素を変換する
        System.out.println("◆各場所の長さを表示");
        places.stream()
                .map(place -> place + "の長さ：" + place.length())
                .forEach(place -> System.out.println(place));
        
        //sortedを使ってソート
        //sorted：要素を自然順序でソートする
        System.out.println("◆ソート");
        places.stream()
                .sorted()
                .forEach(place -> System.out.println(place));
        
        //collectを使って結果を別のリストに格納
        //collect：ストリームの結果を新しいコレクションに集める
        //.collect(Collectors.toList()); filterで収集した要素を新しいリストに格納する
        List<String> filteredPlaces = places.stream()
                .filter(place -> place.contains("ス"))
                .collect(Collectors.toList());
        System.out.println("「ス」を含む場所：" + filteredPlaces);
    }
}
