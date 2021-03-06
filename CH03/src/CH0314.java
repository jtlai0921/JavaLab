import static java.lang.System.out;

//轉化一個5X5的稀疏矩陣
public class CH0314 {
   public static void main(String[] args) {
      int[][] sparse = {
            { 0,  0,  0, 27,  0 },
            { 0,  0, 13,  0,  0 },
            { 0, 41,  0,  0, 36 },
            {52,  0,  9,  0,  0 },
            { 0,  0,  0, 18,  0 } };
      int nonZero = 0; //統計矩陣中非零項目
      int j, k;
      out.println("------- 稀疏陣列 -------");
      for (j = 0; j < sparse.length; j++) {
         for (k = 0; k < sparse[j].length; k++) {
            out.printf("%3d|", sparse[j][k]);
            if (sparse[j][k] != 0)
               nonZero += 1;
         }
         out.println();
      }
      int idx = 1; //處理稀疏矩陣
      int[][] matrix = new int[8][3];
      matrix[0][0] = sparse.length;
      matrix[0][1] = sparse.length;
      matrix[0][2] = nonZero;
      for (int row = 0; row < sparse.length; row++){
         for(int col = 0; col < sparse[row].length; col++){
            if (sparse[row][col] != 0){
               matrix[idx][0] = row + 1;
               matrix[idx][1] = col + 1;
               matrix[idx][2] = sparse[row][col];
               idx += 1;
            }
         }
      }
      out.println("\n--壓縮後的稀疏陣列--" + idx);
      for (j = 0; j < nonZero + 1; j++){
         for (k = 0; k < 3; k++)
            out.printf("%3d|", matrix[j][k]);
         out.println();
      }
   }
}