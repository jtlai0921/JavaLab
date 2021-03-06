import static java.lang.System.out;

//兩個矩陣相加
public class CH0311 {
   public static void main(String[] args) {
      int[][] ary1 = 
         {{5, 3, 2}, {11, 7, 13}, {9, 13, 15}};
      int[][] ary2 = 
         {{1, 6, 8}, {4, 12, 16}, {9, 18, 21}};
      out.println(" -- 矩陣A -- ");
      show(ary1);
      out.println("\n -- 矩陣B -- ");
      show(ary2);
      out.println("\n矩陣A + 矩陣B 結果");
      out.println("---------------");
      itemAdd(ary1, ary2);
   }

   //靜態方法-輸出矩陣元素
   static void show(int[][] source) {
      for (int row[] : source){        //讀取陣列的列數
         for (int item : row)          //讀取陣列的欄元素
            out.printf("%3d|", item);  //輸出陣列元素
         out.println();
      }
   }

   //定義靜態方法-兩個矩陣相加
   static void itemAdd(int[][] source1, 
         int[][] source2){ 
      int[][] matrix = new int[3][3]; 
      for (int j = 0; j < 3; j++){    //讀取陣列的列數
         for (int k = 0; k < 3; k++) {//讀取陣列的欄元素
            matrix[j][k] = source1[j][k] + source2[j][k];
            out.printf("%3d|", matrix[j][k]);//輸出陣列元素
         }
         out.println();
      }
   }
}
