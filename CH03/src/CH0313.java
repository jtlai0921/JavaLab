import static java.lang.System.out;

//將矩陣A轉置後以矩陣B來儲存
public class CH0313 {
   public static void main(String[] args) {
      int[][] ary1 = {{11, 12, 13, 14},
            {22, 24, 26, 28},
            {33, 36, 39, 41}};
      int[][] ary2 = new int[4][3];
      out.println("------原來矩陣------");
      show(ary1);
      out.println("\n--轉置後矩陣--");
      Transpose(ary1, ary2);
      show(ary2);
   }

   //定義靜態方法-將矩陣轉置
   static void Transpose(int[][] source1,
         int[][] source2) {
      for(int j = 0; j < source1.length; j++) {
         for(int k = 0; k < source1[j].length; k++)
            source2[k][j] = source1[j][k];
      }
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