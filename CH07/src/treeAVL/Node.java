package treeAVL;

//定義雙向鏈結串列的節點
public class Node {
   public int item;                //資料欄
   public int balance;             //平衡係數
   public Node Lnext, Rlink;       //指向前一個、下一個節點鏈結

   Node(int data){   //定義建構式 - 傳入數值
      this.item = data;
      this.balance = 0;
      this.Lnext = null;
      this.Rlink = null;
   }
}