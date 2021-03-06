package SingleLinkedList;
import static java.lang.System.*;

//在單向鏈結串列新增節點
public class LinkedList {
   Node first;//指向第一個節點的參考
   
   //新節點加到第一個節點之前
   public void addHead(int value) {
      Node newNode = new Node(value);
      newNode.next = first;
      first = newNode;
   }

   //新增的節點變成最後節點
   public void addLast(int value) {
      //指向目前節點的參考current, new運算子實體化新節點newNode
      Node current, newNode;
      newNode = new Node(value);
      //如果第一個節點first是空的，就把新節點設為第一個節點
      if(first == null)
         first = newNode;
      else {   //有第一個節點就走訪
         current = first;
         //走訪串列到最後節點
         while(current.next != null)
            current = current.next;
         //目前節點的next參考指向新節點
         current.next = newNode;
      }
   }

   //新節點加到指定節點之後
   public void InsertBehind(int data, int special){
      Node ptr = first; //把參考ptr指向第一個節點

      while(ptr != null) {//走訪串列查找指定節點
         if (ptr.item == special)
            break;
         ptr = ptr.next;
      }

      if (ptr == null)
         out.printf("串列中沒有節點[%d]%n", special);
      else{
         //1.產生新節點newNode，把新節點指標Next指向目前節點ptr的下一個節點
         Node newNode = new Node(data);
         newNode.next = ptr.next;
         //2.目前節點ptr的指標Next指向新節點
         ptr.next = newNode;
      }
   }

   //指定位置加入新節點，原有節點向後移動
   public void InsertAt(int data, int pos){
      Node newNode;   //新點節
      int j;

      //指定位置是第一個節點，新增節點到第一個節點之前，變成第一個節點
      if (pos == 1)
         addHead(data);//呼叫方法加到第一個節點之前
      else{  //找到指定位置的前一個節點(pos - 1)來新增節點
         Node ptr = first;   //目前節點參考指向第1個節點
         for (j = 1; j < pos - 1 && ptr != null; j++)
            ptr = ptr.next;

         //ptr指向欲插入位置的前一個節點
         if (ptr == null)
            out.printf("只有位置<%d>可插入", j);
         else{
            //1.新節點參考next指向目前節點next參考所指的下一個節點
            newNode = new Node(data);
            newNode.next = ptr.next;
            //2.目前節點next參考指向新節點
            ptr.next = newNode;
         }
      }
   }

   //輸出節點
   public void show(){
      Node current = first;
      while(current!= null){
         System.out.printf("[%d]->", current.item);
         current = current.next;
      }
      System.out.println();
   }

   //刪除第一個節點
   public void removeFirst(){
      //若第一個節點被刪除，指定下一個節點為第一個節點
      if (first == null)
         return;
      first = first.next;
   }

   //刪除最後一個節點
   public void removeLast(){
      if (first == null)
         out.println("串列是空的");

      else if(first.next == null)
         first = null;
      
      else{
         Node ptr = first;   //目前指標指向第一個節點
         while (ptr.next.next != null)
            ptr = ptr.next;
         ptr.next = null;   //刪除最後節點，Next設為null
      }
   }

   //刪除指定節點
   public void removeAt(int data){
      if(first == null)
         out.println("串列是空的...");

      //第一個節點被刪除
      if(first.item == data)
         first = first.next;
      else{ //刪除第一個節點之外的其他節點
         Node ptr = first;

         //走訪串列來查找欲刪除節點
         while (ptr.next != null){
            //下一個節點的資料符合欲刪除節點
            if (ptr.next.item == data)
               break;
            ptr = ptr.next;
         }
         if (ptr.next == null)
            out.printf("串列無此節點[%d]", data);
         else   //目前所在節點的Next指標指向被刪除節點的下一個節點
            ptr.next = ptr.next.next;
      }
   }

   //反轉串列元素
   public void revertNode(){
      Node previous = null, current; //previous為上一個節點

      while (first != null){
         current = first;          //由第一個節點開始走訪
         first = current.next;     //移向下一個節點
         current.next = previous;  //目前節點current的Next指標指向上一個節點
         previous = current;       //目前指標指向前一個節點
      }
      first = previous;
   }
}
