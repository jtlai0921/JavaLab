package vertice;
import static java.lang.System.*;

//以陣列實作圖形
public class CH0801 {
   static int[][] matrix = new int[5][5];//二維矩陣
   public static void main(String[] args) {
      int[][] data = {{1, 2}, {2, 1}, {1, 3}, {3, 1},
                     {2, 4}, {4, 2}, {3, 4}, {4, 3}};

      GraphCreate(data, 5);

      out.println("圖形以相鄰矩陣儲存");
      out.println("-----1--2--3--4");
      for (int row = 1; row < matrix.length; row++){
         out.printf("%d |", row);
         for (int col = 1; col < matrix[row].length; col++)
            out.printf("%3d", matrix[row][col]);
         out.println();
      }
   }

   //定義靜態方法來表示圖形
   public static void GraphCreate(int[][] ary, int len){
      int start, finish, j;

      for (j = 0; j < len; j++){
         start = ary[j][0];
         finish = ary[j][1];
         matrix[start][finish] = 1;
      }
      out.println();
   }
}
