/*
 * 例外処理
 * ・try-catch ~ finally文
 */

 /*
  * 参考：try-with-resource 自動的にclose
  * ScannerやBufferedReaderなどのリソースを安全に扱うためには、以下のような構文が有効
  * 
    try(Scanner scanner = new Scanner(System.in)){
        int num = scanner.nextInt();
        System.out.plintln("入力値：" + num)};
    } catch(Exception e){
        System.out.println("エラーが発生しました");
    } 
  */

import java.util.Scanner;

public class TestException{
    public static void main(String[] args) throws MyException{
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        boolean success = false;
        //例外処理はtry~catch分で記述する。
        try{
            System.out.print("整数を入力してください：num = ");
            int num = Integer.parseInt(scanner.nextLine());
            
            //自作の例外は、throwを使って発生させる
            if (num < 0){
                throw new MyException("負の値は許可されていません");
            }
            result = 100 / num;
            success = true;
        }
        //  0で割った場合 
        catch(ArithmeticException e){ 
            System.out.println("エラー：0で割ることはできません。");
        }
        // 数値以外の入力があった場合
        catch(NumberFormatException e){
            System.out.println("エラー：整数を入力してください。");
        }
        // Java7 以降では,catchに複数の例外型を ｜ でまとめて記述できる
        catch(ArrayIndexOutOfBoundsException | SecurityException e){
            System.out.println("複数の例外を検知しました。");
        }
        //finally は 例外の発生に関係なく、必ず実行される
        finally{
            scanner.close();
            if(success){
                System.out.println("計算結果：100/num = " + result);
            }
            System.out.println("プログラム終了");
        }
    }
}