/*
 * Java演算子
 * ・算術演算子     :+, -, *, /, %
 * ・代入演算子     :=, +=, -=, *=, /=, %=    
 * ・比較演算子     :>, <, >=, <=, ==, !=
 * ・論理演算子     :&&, ||, !
 * ・ビット演算子   :&, |, ^, ~, <<, >>
 *  
*/

public class Operator {
    public static void main(String[] args) {
        //算術演算子 加減剰除余（+,-,*,/,%）
        //べき乗にはMath.pow()メソッドを使用する
        //除算補足：割る数が0の場合、整数ならArithmeticException、浮動小数点ならInfinity または NaN になる
        int a = 10;
        int b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("加算：" + (a + b));
        System.out.println("減算：" + (a - b));
        System.out.println("剰算：" + (a * b));
        System.out.println("除算：" + (a / b));
        System.out.println("余算：" + (a % b));

        double power = Math.pow(a,b);
        System.out.println("累乗：" + power);

        //比較演算子
        //値を比較して true または false を返す
        //大なり
        System.out.println("a > b:" + (a > b));
        System.out.println("a >= b:" + (a <= b));
        //小なり
        System.out.println("a < b:" + (a < b));
        System.out.println("a <= b:" + (a <= b));
        //イコール
        System.out.println("a == b:" + (a == b));
        //ノットイコール
        System.out.println("a != b:" + (a != b));

        //論理演算子 複数の条件を組み合わせる
        int x = 15;
        System.out.println("x = " + x);
        //&& 両方がtrueならtrue 
        System.out.println("10 < x < 20 ? : " + (10 < x && x < 20));
        //|| どちらかがtrueならtrue
        System.out.println("x == 15  or x == 20? : " + (x == 15 || x == 20));
        //!a aがtrueならfalseを返す
        System.out.println("x == 15 なら false : " + !(x == 15));

        //ビット演算子 整数のビット単位で処理を行う演算子
        int t = 12; // 1100
        int h= 10; // 1010
        String tBit = Integer.toBinaryString(t);
        String hBit = Integer.toBinaryString(h);

        System.out.println(String.format("a = %s(%s), b = %s(%s)", t, tBit, h, hBit));

        System.out.println(String.format("両方のビットが1なら1（AND）: t(%s) & h(%s) : %s",tBit,hBit,Integer.toBinaryString(t & h)));
        System.out.println(String.format("どちらかのビットが1なら1（OR）: t(%s) | h(%s) : %s",tBit,hBit,Integer.toBinaryString(t | h)));
        System.out.println(String.format("ビットが異なるとき1（XOR）: t(%s) ^ h(%s) : %s",tBit,hBit,Integer.toBinaryString(t ^ h)));
        System.out.println(String.format("各ビットを反転（NOT）: ~t(%s)  : %s",tBit,Integer.toBinaryString(~t)));
        System.out.println(String.format("ビットを左に1ビットシフト（x2）: t(%s) << 1 : %s",tBit,Integer.toBinaryString(t << 1)));
        System.out.println(String.format("ビットを右に1ビットシフト（÷2）: t(%s) >> 1 : %s",tBit,Integer.toBinaryString(t >> 1)));
        

    }
}
