/*
 * 繰り返し処理
 * ・for文
 * ・拡張for文（for-each）
 * ・while文
 * ・do-while文
 */

public class Loop {
    public static void main(String[] args) {

        //for文 指定された回数だけ処理を繰り返す
        System.out.println("for文");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //for-each文（拡張for文） 配列やコレクションなどの要素を順番に取り出して処理する
        System.out.println("for-each文");
        int [] numbers = {2,4,6,8,10};
        for (int num : numbers){
            System.out.println(num);
        }

        //while文 条件がtrueの間、処理を繰り返す
        int i = 0;
        System.out.println("while文");
        while(i < 10){
            i++;
            System.out.println(i);
        }
        System.out.println("処理を終了します");

        //do-while文 最低1回は必ず処理が実行される繰り返し構文
        int j = 0;
        System.out.println("do-while文");
        do{
            System.out.println("j の値は：" + j);
            j++;
        }while(j < 3);

        //break ループを途中で終了する
        int k = 0;
        //while(true)、for(;;)で無限ループになる
        System.out.println("breakの処理");
        while (true){
            k++;
            //10ループしたらループを抜ける
            if(k > 10){
                System.out.println("10回繰り返したので、ループを抜ける");
                break;
            }
            System.out.println(k);
        }

        //continue 処理をスキップして次のループに進む
        int l = 0;
        System.out.println("continueの処理");
        while(true){
            l++;
            //10回繰り返したらループを終了する
            if(l > 10){
                System.out.println("10回繰り返したので、ループを抜ける");
                break;
            }
            //2で割ったときのあまりが1（奇数）だった場合、以降の処理をスキップして次のループ処理に移る
            if (l % 2 == 1){
                System.out.println("奇数だったため処理をスキップ");
                continue;
            }
            System.out.println(l);
        }

    }
}
