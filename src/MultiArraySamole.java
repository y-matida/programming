/*
 * 多次元配列
 * 配列の中に配列を定義することも可能。
 * 2×2の行列などは多次元配列で表現する
 */

public class MultiArraySamole {
    public static void main(String[] args) {
        
        //3x4の2次元配列を定義する
        var matrix = new int[3][4];

        //2次元配列へのアクセスと代入
        for(var i = 0; i < matrix.length; i++){
            for(var j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i*3 + j + 1; //値の代入
            }
        }

        //2次元配列の要素を表示
        for(var i = 0; i < matrix.length; i++){
            for(var j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
