package stack;

//定義鏈結串列的節點
class Node {
   int item;
   Node next;

   //定義建構函式 - 傳入數值
   Node(int data){
      this.item = data;
      this.next = null;
   }
}
