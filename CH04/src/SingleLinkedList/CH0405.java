package SingleLinkedList;
import static java.lang.System.*;

//刪除節點的3個方法實作
public class CH0405 {
   public static void main(String[] args) {
      LinkedList list2 = new LinkedList();
      int[] number = {65, 124, 43, 225, 81, 346};

      //產生節點
      out.print("產生節點 --> ");
      for(int item : number)
         list2.addLast(item);
      list2.show();

      //刪除第一個節點
      out.print("刪除第一個節點 --> ");
      list2.removeFirst();
      list2.show();

      //刪除最後的節點
      out.print("刪除最後的節點 --> ");
      list2.removeLast();
      list2.show();

      //刪除指定節點
      out.print("刪除最後的節點 --> ");
      list2.removeAt(225);
      list2.show();
   }
}
