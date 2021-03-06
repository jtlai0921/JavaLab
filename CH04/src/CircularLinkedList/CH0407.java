package CircularLinkedList;
import static java.lang.System.out;

//實作單簻環狀鏈結串列
public class CH0407 {
   public static void main(String[] args) {
      CircularList list = new CircularList();
      int[] number = {65, 124, 43, 225};

      //產生節點
      out.print("產生節點 --> ");
      for(int item : number)
         list.addLast(item);
      list.display();

      //新增節點變成第一個節點
      out.println("新節點變成第一個節點");
      list.addFirst(346);
      list.display();

      //刪除節點
      out.print("刪除節點 --> ");
      list.removeAt(124);
      list.display();
   }
}
