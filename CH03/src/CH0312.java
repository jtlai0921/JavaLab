import static java.lang.System.out;

//矩陣ary1和ary2相乘
public class CH0312 {
   public static void main(String[] args) {
      int[][] ary1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
      int[][] ary2 = { { 7, 9, 11 }, { 8, 10, 12 } };
      out.println("第一個矩陣 2X3");//呼叫show()方法輸出矩陣
      show(ary1);
      out.println("第二個矩陣 3X2");
      show(ary2);
      out.println("兩個矩陣 相乘結果");
      MatrixMulti(ary1, ary2); //將矩陣ary1、 ary2相乘
   }

   //定義靜態方法-將兩個矩陣相乘
   static void MatrixMulti(int[][] oneAry,
         int[][] twoAry){
      int[][] matrix =
            new int[oneAry.length][twoAry[0].length];
      for (int j = 0; j < matrix.length; j++){
         for (int k = 0; k < matrix[j].length; k++){
            for(int m = 0; m < twoAry.length; m++) {
               matrix[j][k] +=
                     oneAry[j][m] * twoAry[m][k];
            }
         }
      }
      show(matrix);//輸出相乘後矩陣
   }

   //定義靜態方法-輸出矩陣
   static void show(int[][] source) {
      for (int row[] : source){        //讀取陣列的列數
         for (int item : row)          //讀取陣列的欄元素
            out.printf("%3d|", item);  //輸出陣列元素
         out.println();
      }
   }
}