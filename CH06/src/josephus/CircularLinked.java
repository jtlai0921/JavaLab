package josephus;
import static java.lang.System.*;

//定義環狀單向鏈結串列
public class CircularLinked {
   Node first;
   public CircularLinked(){//建構式
      first = null;
   }

   //定義成員方法 -- 新增節點到最後一個節點之後
   public void Enqueue(int data){
      //指向目前節點的參考current
      Node current;

      //如果第一個節點first是空的，就把新節點設為第一個節點
      if (first == null){
         first = new Node(data);
         first.next = first;
      }
      else {  //有第一個節點就以while廻圈走訪
         Node newNode = new Node(data);
         current = first;
         //走訪串列到最後節點
         while (current.next != first)
            current = current.next;
         //1.目前節點的next指標指向新節點
         current.next = newNode;
         //2.新節點的next指標指向第一個節點
         newNode.next = first;
      }
   }

   //Josephus問題
   public void Josephus(int len, int step){
      Node ptr = first;
      out.print("移除節點");
      int count = 1;

      //由於有人出列，每次走訪後依count來變數節點數
      for (count = len; count > 1; count--){
         for (int j = 0; j < step - 1; j++)
            ptr = ptr.next;
         out.printf("%4d", ptr.item);
         RemoveAt(ptr);   //從串列中移除被淘汰者
         ptr = ptr.next;
      }
   }

   //移除節點
   public void RemoveAt(Node key){
      Node current, prev;
      if (first == key){   //移除第一個節點
         current = first;
         //移動指標
         while (current.next != first)
            current = current.next;
         //將目前節點的參考指向第二個節點
         current.next = first.next;
         //首節點變更為下一個節點
         first = first.next;
      }
      else {  //情形二：首節點以外的節點要被移除
         current = first;
         prev = null;
         //移動指標找到刪除的節點
         while (current.next != first){
            prev = current;
            current = current.next;
            if (current == key){
               //前一個節點的指標指向目前節點的下一個節點
               prev.next = current.next;
               current = current.next;
            }
         }
      }
   }

   //成員方法 -- 輸出節點
   public void Display(){
      Node current = first;
      while (current != null){
         out.printf("%4d", current.item);
         current = current.next;
         if (current == first)
            break;
      }
      out.println();
   }
}
