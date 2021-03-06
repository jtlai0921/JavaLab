package SingleLinkedList;

import static java.lang.System.out;

//反轉鏈結串列
public class CH0406 {
   public static void main(String[] args) {
      LinkedList list3 = new LinkedList();
      int[] number = {65, 124, 43, 225, 81, 346};

      //產生節點
      out.print("產生節點 --> ");
      for(int item : number)
         list3.addLast(item);
      list3.show();

      //反轉鏈結串列
      out.print("反轉鏈結串列 --> ");
      list3.revertNode();
      list3.show();
   }
}
