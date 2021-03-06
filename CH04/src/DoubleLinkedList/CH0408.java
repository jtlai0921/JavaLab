package DoubleLinkedList;

import static java.lang.System.out;

//
public class CH0408 {
   public static void main(String[] args) {
      DoublyList list = new DoublyList();
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

      //指定位置插入新節點
      out.println("指定位置新增節點");
      list.insertAt(125, 3);
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
