import static java.lang.System.out;

//以三層for廻圈讀取三維陣列
public class CH0307 {
   public static void main(String[] args) {
      //初始化三維陣列
      int[][][] arr3D = {
                        {{11, 12, 13},
                         {22, 24, 26}}, 
                        {{33, 35, 37},
                         {44, 46, 48}}
                        };

      out.println("元素：" + arr3D[1][1][1] +
            ", 屬於第2個表格，位於第2列 第2欄\n");

      //讀取三維陣列，先讀表格，再讀表格的列，然後是每列的欄
      for (int table = 0; table < arr3D.length; table++){
         out.printf("----表格<%d> ----\n", table + 1);
         for (int j = 0; j < arr3D[table].length; j++){
            for(int k = 0; k < arr3D[table][j].length; k++){
               //依序輸出多維陣列的元素
               out.printf("%3d|", arr3D[table][j][k]);
            }
            out.println();   //換行
         }//end second for-loop
         out.println();   //換行
      }//end first for-loop
   }
}
