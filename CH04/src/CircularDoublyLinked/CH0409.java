package CircularDoublyLinked;
import static java.lang.System.*;

//實作環狀雙向鏈結串列
public class CH0409 {
   public static void main(String[] args) {
      cdLinkedList list = new cdLinkedList();
      int[] number = {78, 95, 84};

      //產生節點
      out.print("產生節點 --> ");
      for(int item : number)
         list.addLast(item);
      list.display();

      //新增節點變成第一個節點
      out.println("新節點變成第一個節點");
      list.addFirst(67);
      list.display();

      //刪除第一個節點
      out.println("刪除第一個節點");
      list.removeFirst();
      list.display();

      //刪除最後節點
      out.println("刪除最後節點");
      list.removeLast();
      list.display();
   }
}
