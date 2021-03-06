import static java.lang.System.out;

//第3章(二)-<Q3>
public class Lab0303 {
   public static void main(String[] args) {
      int[][] sparse = {
            { 0,  0, 24,  0,  0,  0 },
            { 0,  0,  0, 35,  0,  0 },
            {17,  0,  0,  0,  0, 58 },
            { 0,  0,  0,  0, 43,  0 },
            { 0, 62,  0,  0,  0,  0 } };

      final int rows = 5; //列
      final int cols = 6; //欄

      int nonZero = 0; //統計矩陣中非零項目
      int j, k;
      out.println("------稀疏陣列------");
      for (j = 0; j < sparse.length ; j++){
         for (k = 0; k < sparse[j].length; k++){
            out.printf("%3d|", sparse[j][k]);
            if (sparse[j][k] != 0)
               nonZero += 1;
         }
         out.println();
      }
      //處理稀疏矩陣
      int idx = 1;
      int[][] matrix = new int[76][3];
      matrix[0][0] = rows;
      matrix[0][1] = cols;
      matrix[0][2] = nonZero;

      //依據稀疏矩陣來取得非零元素的列、欄索引和值
      for (j = 0; j < 5; j++)
      {
         for (k = 0; k < 6; k++)
         {
            if (sparse[j][k] != 0)
            {
               matrix[idx][0] = j + 1;
               matrix[idx][1] = k + 1;
               matrix[idx][2] = sparse[j][k];
               idx += 1;
            }
         }
      }

      out.println("\n壓縮後的稀疏陣列");
      for (j = 0; j < nonZero + 1; j++)
      {
         for (k = 0; k < 3; k++)
            out.printf("%4d|", matrix[j][k]);
         out.println();
      }
   }
}
