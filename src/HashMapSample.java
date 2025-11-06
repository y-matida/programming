/*
 * インターフェース Map (具象クラス例：HashMap, TreeMap)
 * ・キーと値のペアを保持するコレクション
 * ・キーは重複しない。
 * ・順序保証なし。
 * 活用シーン
 * ・キーによる高速なデータアクセスが必要な場合
 */

import java.util.HashMap;
import java.util.Map;


public class HashMapSample {
    public static void main(String[] args) {
        // HashMapの定義
        Map<String, String> members = new HashMap<>();

        // HashMapにキーと値を追加
        members.put("GK","前川");
        members.put("DF","菅原");
        members.put("MF","守田");
        members.put("FW","上田");

        // 要素の取得
        String fw = members.get("FW");
        System.out.println("FW : " + fw);

        //要素の変更
        members.put("FW", "細谷");  // FW要素を置換
        System.out.println("1番目の要素（置換後）：" + members.get("FW"));

        //要素の削除
        System.out.println("GKの要素（削除前）：" + members.get("GK"));
        members.remove("GK");
        System.out.println("GKの要素（削除後）：" + members.get("GK"));

        //拡張forループによる取得：entrySet
        for (Map.Entry<String, String> entry : members.entrySet()){
            System.out.println("entrySetキー：" + entry.getKey() + ", 値：" + entry.getValue());
        }

        //拡張forループによる取得：keySet
        for (String key : members.keySet()){
            System.out.println("keySet キー：" + key + ",値：" + members.get(key));
        }

        // 拡張forループによる取得：values
        for (String value : members.values()){
            System.out.println("values 値：" + value);
        }

        //サイズの取得
        int size = members.size();  //Mapのサイズを取得
        System.out.println("Mapのサイズ（クリア前）：" + size);
        members.clear();    //Mapの内容をクリア
        System.out.println("Mapのサイズ（クリア後）：" + members.size());
    }
}
