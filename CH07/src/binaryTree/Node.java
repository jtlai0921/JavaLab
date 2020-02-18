package binaryTree;

//定義雙向鏈結串列的節點
public class Node {
   public char item;          //資料欄
   public Node Lnext, Rlink;  //指向前一個、下一個節點鏈結

   //定義建構式 - 傳入數值
   public Node(char data){
      this.item = data;
      this.Lnext = null;
      this.Rlink = null;
   }
}
