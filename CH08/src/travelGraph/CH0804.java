package travelGraph;
import static java.lang.System.*;
import vertice.Node;

//以單向鏈結實作圖形-DFS
public class CH0804 {

   static boolean[] visited = new boolean[6]; //記錄已走訪的陣列
   static BFsearch[] travel = new BFsearch[6];

   public static void main(String[] args) {
      int item = 0;
      final int Row = 18;
      int[][] vertex = { //宣告二維矩陣來儲存圖形頂點
            {1, 2}, {2, 1}, {1, 5}, {5, 1}, {2, 3}, 
            {3, 2}, {2, 4}, {4, 2}, {3, 4}, {4, 3},
            {3, 5}, {5, 3}, {4, 5}, {5, 4},
            {2, 5}, {5, 2}, {1, 4}, {4, 1} };

      out.println("------圖形以相鄰串列表示------");
      for (int j = 1; j < 6; j++) {
         visited[j] = false;
         travel[j] = new BFsearch();
         //讀取圖形的頂點
         for (int k = 0; k < Row; k++) {
            if (vertex[k][0] == j) {
               item = vertex[k][1];
               travel[j].addItem(item);
            }
         }
      }

      for (int j = 1; j < 6; j++) {
         out.printf("頂點[%d] ==> ", j) ;
         travel[j].Display();
      }
      out.println("先深後廣搜尋法(DFS)搜尋順序如下：");
      SearchDFS(1);
   }

   //定義靜態方法-先深後廣搜尋法(DFS)
   public static void SearchDFS(int data) {
      visited[data] = true;
      out.printf("頂點[%d] > ", data);

      while ((travel[data].first) != null) {
         //如果尚未走訪，進行DFS遞迴呼叫
         if (visited[travel[data].first.edge] == false) 
            SearchDFS(travel[data].first.edge);
         travel[data].first = travel[data].first.next;
      }
      out.println();
   }
}
