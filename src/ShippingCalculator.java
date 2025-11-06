/*
 * 課題 （仕様）
 * 入力された税抜き価格をもとに、消費税込みの価格と送料を合計した「送料込み価格」を計算し、
 * 結果を表示するソースコードを作成する
 * ・税込み価格が2000円以上の場合は送料無料、2000円未満の場合は350円とする。
 * ・消費税率は10％
 */

import java.util.Scanner;
public class ShippingCalculator {
    public static void main(String[] args) {
        //「税抜き価格」をユーザから取得する
        Scanner scanner = new Scanner(System.in);   // A
        System.out.println("税抜き価格を入力してください：");
        double taxExcludedPrice = scanner.nextDouble();

        // 「税込み価格」を計算する（消費税：10％）
        double taxRate = 0.10;
        double taxIncludedPrice = taxExcludedPrice + (taxExcludedPrice * taxRate);  // B

        //送料の計算
        int shippingCost;
        if(taxIncludedPrice >= 2000){   // C
            shippingCost = 0;
            System.out.println("送料は無料です。");           
        } else{     // D
            shippingCost = 350;
            System.out.printf("送料は%d円です%n",shippingCost);
        }

        // 送料込み税込み価格を計算して変数に代入する。
        double totalPrice = taxIncludedPrice + shippingCost;    // E

        // 「送料込み税込み価格」を小数を含めずに出力する
        System.out.printf("送料込み税込み価格は%.0f円です%n",totalPrice);

    }
}
