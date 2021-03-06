package vertice;
import static java.lang.System.*;

//以單向鏈結定義圖形
public class GrLinkedList {
   Node first, last;

   GrLinkedList(){   //建構式初始化欄位
      first = null;
      last = null;
   }

   //定義成員方法-加入圖形的新節點
   public void AddItem(int data){
      //new運算子產生新節點newNode並配置記憶體
      Node newNode = new Node(data);

      //如果第一個節點first是空的，就把新節點設為首、尾節點
      if (first == null){
         first = newNode;
         last = newNode;
      }
      else{ //有第一個節點就走訪
         last.next = newNode;  //把最後節點的Next參考指向新節點
         last = newNode;       //新節點變成最後節點
      }
   }

   //定義成員方法-輸出鏈結串列節點
   public void Display(){
      Node current;   //指向目前節點
      if (first == null)
         out.println("鏈結串列是空的");
      current = first; //從第一個節點開始準備走訪串列

      //空串不是空的情形下讀取節點
      while (current != null){
         out.printf("[%d]->", current.edge);
         current = current.next;
         if (current == null)
            out.print("null");
      }
      out.println();
   }
}
