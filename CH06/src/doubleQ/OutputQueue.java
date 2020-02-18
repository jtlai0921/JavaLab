package doubleQ;
import static java.lang.System.*;

//定義單向鏈結串列節點
class Node {
   int item;
   Node next;

   //定義建構函式 - 傳入數值
   Node(int data){
      this.item = data;
      this.next = null;
   }
}

//以單向鏈結串列定義輸出限制性雙向佇列
public class OutputQueue {
   private Node rear, front;    //指向佇列後端、前端參考

   //建構式
   OutputQueue(){
      this.rear = null;
      this.front = null;
   }

   //定義成員方法，佇列前端新增項目--等同把新節點加到首節點之前，成為串列首節點
   public void headEnqueue(int data){
      //new運算子產生新節點newNode並配置記憶體，把資料存入佇列
      Node newNode = new Node(data);
      newNode.item = data;

      //如果沒有前端節點，就把新節點設為前端節點
      if (front == null){          //是否是第一次存入
         newNode.next = null;
         rear = newNode;           //rear指向新節點
      }
      else
         //新節點的next參考指向前端第一個節點
         newNode.next = front;
      //前端節點參考front指向新節點
      front = newNode;
   }

   //定義成員方法，佇列後端新增項目--等同把新節點加到末節點之後，成為串列末節點
   public void tailEnqueue(int data){
      Node newNode = new Node(data);
      newNode.item = data;
      newNode.next = null;//產生新節點
      //如果佇列是空的，將front參考指向新節點，而rear指向新節點
      if (rear == null) {
         front = newNode;
         rear = front;
      }
      //把原為末端節點的next參考指向新節點
      rear.next = newNode;
      //再把rear參考指向新節點
      rear = newNode;
   }

   //定義方法來移除佇列項目--等同把串列的首節點移除
   public void Dequeue(){
      Node current = front;  //指向目前節點的參考為頂端節點
      if (front == null) throw
             new IllegalStateException("空白佇列");
      else {  //佇列有節點的情形下才做刪除
         //取得欲刪除節點的值給變數number儲存
         int number = current.item;
         //front參考指向第二個節點
         front = front.next;
         out.printf("[%d]", number);
      }
   }

   public void Display(){
      Node current;   //指向目前節點
      if (front == null)
         out.print("鏈結串列是空的");
      current = front; //從第一個節點開始準備走訪串列

      //空串不是空的情形下讀取節點
      while (current != null){
         out.printf("[%d]->", current.item);
         current = current.next;
      }
      out.println();
   }
}
