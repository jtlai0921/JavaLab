package stack;
import static java.lang.System.*;

//定義鏈結串列
public class LinkedList {
   Node top;//指向堆疊頂端的參考
   int size;

   //建構函式初始化頂端節為空值
   LinkedList(){
      this.size = 0;
      this.top = null;
   }

   //從堆疊頂端壓入元素
   public void pushItem(int data){
      //1.產生新節點newNode，把新節點參考Next指向頂端節點Top
      Node newNode = new Node(data);
      newNode.next = top;
      //2.變更新節點為頂端節點
      top = newNode;
      size++;
   }

   //從堆疊頂端彈出項目
   public void popItem(){
      Node ptr = top;

      if (top != null){
         top = top.next;
         out.printf("堆疊頂端彈出項目[%d]%n", ptr.item);
         size--;
      }
      else
         out.println("堆疊是空的");
   }

   //回傳堆疊頂端元素
   public int peekItem(){
      if (top != null) {
         out.println("頂端元素" + top.item);
         return top.item;
      }
      else
         return -1;
   }

   //輸出堆疊內容
   public void Display(){
      Node current = top;   //指向目前節點的參考為頂端節點
      if (top == null)
         out.println("鏈結串列是空的");
      else {
         //空串不是空的情形下讀取節點
         while (current != null){
            out.printf("[%d]->", current.item);
            current = current.next;
         }
         out.println();
      }
   }
}
