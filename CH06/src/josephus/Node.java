package josephus;

//定義環狀單向鏈結串列節點
public class Node {
   int item;
   Node next;

   //定義建構函式 - 傳入數值
   Node(int data){
      this.item = data;
      this.next = null;
   }
}
