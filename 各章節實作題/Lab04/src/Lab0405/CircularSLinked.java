package Lab0405;
import static java.lang.System.*;

public class CircularSLinked {
   Node first, last;
   public CircularSLinked(){ //建構式
      first = null;
      last = null;
   }

   //輸出節點
   public void display(){
      Node current;   //指向目前節點

      if (first == null)
         out.println("鏈結串列是空的");
      current = first; //從第一個節點開始準備走訪串列

      //串列有節點的情形下才讀取節點
      while (current != null){
         out.printf("[%d]->", current.item);
         current = current.next;
         if (current == last)
            break;
      }
      out.printf("[%d]->null", current.item);
      out.println();
   }

   //新增節點到最後一個節點之後
   public void addLast(int data){
      Node newNode = new Node(data);
      //如果最後節點last是空的，就把新節點設為第一個、最後節點
      if (last == null){
         first = newNode;
         last = newNode;
      }
      else {
         //1.最後節點的Next參考指向新節點
         last.next = newNode;
         //2.新節點鏈結Next指向最後節點
         newNode.next = last;
         //3.最後節點參考指向新節點
         last = newNode;
      }
   }

   //定義成員方法-移除第一個節點
   public void removeFirst(){
      //若第一個節點被刪除，指定下一個節點為第一個節點
      Node current = first;

      while (current.next != first){
         //out.println(current.item);
         current = current.next;
         if (current == last)
            break;
      }
      out.printf("節點 [%d] 已被移除\n", first.item);
      //1.將目前節點Next鏈結指向第二個節點
      current.next = first.next;
      //2.變更第二個節點為第一個節點
      first = first.next;
   }
}