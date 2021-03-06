package vertice;
import static java.lang.System.*;

//以單向鏈結實作圖形
public class CH0802 {
   public static void main(String[] args) {
      int item = 0;
      final int Row = 14;
      int[][] vertex = { //宣告二維矩陣來儲存圖形頂點
            {1, 2}, {2, 1}, {1, 3}, {3, 1},
            {1, 4}, {4, 1}, {2, 5}, {5, 2},
            {2, 6}, {6, 2}, {4, 7}, {7, 4},
            {4, 8}, {8, 4} };

      GrLinkedList[] graphics = new GrLinkedList[10];

      out.println("---圖形以相鄰串列表示---\n");
      for (int j = 1; j < 9; j++) {
         graphics[j] = new GrLinkedList();
         out.printf("頂點[%d] ==> ", j);
         for (int k = 0; k < Row; k++){
            if (vertex[k][0] == j) {
               item = vertex[k][1];
               graphics[j].AddItem(item);
            }
         }
         graphics[j].Display();
      }
   }
}
