package priority;
import static java.lang.System.*;

//定義單向鏈結串列的節點
class QNode{
   int item, prior; //資料、權值
   QNode next;       //指向下一個節點的參考

   //定義建構式 - 傳入資料、權值
   QNode(int data, int pri){
      this.item = data;
      this.prior = pri;
      this.next = null;
   }
}

//單向鏈結串列實作優先佇列
public class PriQueue {
   private QNode front = null;
   //定義成員方法，佇列後端新增項目
   public QNode Enqueue(int data, int precede){
      QNode ptr; //指向目前節點的參考
      QNode newNode = new QNode(data, precede);
      newNode.item = data;
      newNode.prior = precede;

      //接收的權值會和佇列的權值做比較
      if (front == null || precede < front.prior){
         newNode.next = front;
         front = newNode;
      }
      else {
         ptr = front; //目前節點參考指向前端節點
         //走訪節點，且節點的優先權較小
         while (ptr.next != null && 
               ptr.next.prior <= precede)
            ptr = ptr.next;
         //新節點的參考Next指向下一個節點
         newNode.next = ptr.next;
         //目前節點的參考指向新節點
         ptr.next = newNode;
      }
      return front;
   }

   //定義方法來移除佇列前端項目
   public void Dequeue(){
      int number;
      QNode current = front;  //指向目前節點的參考為頂端節點
      if(front == null) throw
             new IllegalStateException("空白佇列");
      else {  //佇列有節點的情形下才做刪除
         //取得欲刪除節點的值給變數number儲存
         number = current.item;
         //Front參考指向第二個節點
         front = front.next;
         out.printf("前端節點[%d]已移除%n", number);
      }
   }

   //輸出佇列內容
   public void Display(){
      QNode ptr = front;
      if (front == null)
         out.println("空的佇列，無法輸出內容");
      else{
         out.println("----優先佇列----");
         while (ptr != null){
            out.printf("%4d, 權值 = [%d]%n", ptr.item, ptr.prior);
            ptr = ptr.next;
         }
      }
   }
}
