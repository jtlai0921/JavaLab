package SingleLinkedList;

//新增節點的4個方法
public class CH0404 {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      int[] number = {65, 124, 43};

      for(int item : number)
         list.addLast(item);
      list.show();

      //新增節點變成第一個節點
      list.addHead(225);
      list.show();

      //新節點加到節點124之後
      list.InsertBehind(133, 124);
      list.show();

      //指定位置3新增節點[71]
      list.InsertAt(71, 3);
      list.show();
   }
}
