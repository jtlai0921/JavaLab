package CircularDoublyLinked;
import static java.lang.System.*;

//定義環狀雙向鏈結串列
public class cdLinkedList {
   Node first, last;
   public int count = 0; //屬性count統計節點數

   //定義建構式--初始化第一個、最後節點為空值
   cdLinkedList(){
      first = null;   //指向第一個節點的參考
      last = null;    //指向最後一個節點的參考
   }

   //輸出節點
   public void display(){
      Node current;   //指向目前節點
      if (first == null)
         out.println("鏈結串列是空的");
      current = first; //從第一個節點開始準備走訪串列

      //串列不是空的情形下讀取節點
      while (current != null){
         out.printf("[%d]->", current.item);
         current = current.Rlink;
         if (current == first)
            break;
      }
      out.printf(" 節點數: %d%n", count);
   }

   //新增節點到最後一個節點之後
   public void addLast(int data){
      //new運算子產生新節點newNode並配置記憶體
      Node newNode = new Node(data);

      //如果第一個節點first是空的，就把新節點設給首、尾節點
      if (last == null){
         first = newNode;
         last = newNode;
      }
      else {   //串列有節點的話
         //1.將串列最後節點last的右鏈結RLink指向新節點
         last.Rlink = newNode;
         //2.把新節點的左鏈結LNext指向串列的最後一個節點
         newNode.Lnext = last;
         //3.新節點變成最後一個節點
         last = newNode;
         //4.把最後節點的右鏈結RLink指向第一個節點
         last.Rlink = first;
         //5.第一個節點左鏈結LNext指向最後一個節點
         first.Lnext = last;
      }
      count++;
   }

 //case 2 -- 新增節點到第一個節點之前
   public void addFirst(int data){
      //產生新節點newNode並配置記憶體空間, 把新節點右鏈結RLink指向第一個節點first
      Node newNode = new Node(data);
      newNode.Rlink = first;

      //如果第一個節點first是空的，就把新節點設給首、尾節點
      if (first == null){
         first = newNode;
         last = newNode;
      }
      else {   //有第一個節點的情形下
         //1.把新節點的右鏈結Rlink指向串列的第一個節點
         newNode.Rlink = first;
         //2.將串列第一個節點的左鏈結Lnext指向新節點
         first.Lnext = newNode;
         //3.設新節點為串列的第一個節點
         first = newNode;
         //4.第一個節點的左鏈結指向最後節點
         first.Lnext = last;
         //5.最後節點的右鏈結指向第一個節點
         last.Rlink = first;
      }
      count++;
   }

   //刪除第一個節點
   public void removeFirst(){
      //狀況1: 先判斷是否有第一個節點？若無表示它是空串列
      if (first == null)
         out.println("空的鏈結串列，沒有節點可刪除");
      //狀況2: 只有一個節點
      else if (count == 1){
         first = null;
         last = null;
         count--;
      }
      else {   //狀況3: 第一個節點被刪除，指定下一個節點為第一個節點
         //1.目前節點參考current指向第二個節點
         Node current = first.Rlink;
         //2.第一個節點的右鏈結RLink設為空值
         first.Rlink = null;
         //3.目前節點變為第一個節點
         first = current;
         //4.已是第一個節點的左鏈結LNext指向最後節點
         first.Lnext = last;
         //5.最後節點的右鏈結RLink指向第一個節點
         last.Rlink = first;
         count--;
      }
   }

   //刪除最後一個節點
   public void removeLast(){
      //狀況1: 先判斷是否有最後節點？若無表示它是空串列
      if (last == null)
         out.println("串列是空的，無法刪除");
      //狀況2: 只有一個節點
      else if (count == 1){
         first = null;
         last = null;
         count--;
      }
      else {   //狀況3: 刪除最後節點
         //1.目前節點參考ptr指向最後節點的前一個節點
         Node ptr = last.Lnext;
         //2.先設最後節點的左鏈結為null
         last.Lnext = null;
         //3.把參考ptr所指的目前節點設為最後一個節點
         last = ptr;
         //4.最後節點的右鏈結指向第一個節點
         last.Rlink = first;
         //5.第一個節點的左鏈結指向最後節點
         first.Lnext = last;
         count--;
      }
   }
}
