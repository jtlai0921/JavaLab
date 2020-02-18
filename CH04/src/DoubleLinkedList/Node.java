package DoubleLinkedList;

//定義雙向鏈結串列
public class Node {
   int item;    //資料欄
   Node Lnext;  //指向前一個節點
   Node Rlink;  //指向下一個節點

   Node(int data){   //建構式
      this.item = data;
      this.Lnext = null;
      this.Rlink = null;
   }
}
