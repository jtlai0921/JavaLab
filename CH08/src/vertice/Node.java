package vertice;

//定義單向鏈結串列的節點
public class Node {
   Node[] head = new Node[14];
   
   //自動實作屬性
   public int edge;
   public Node next;

   //定義建構函式 - 傳入數值
   public Node(int data){
      edge = data;
      next = null;
   }
}
