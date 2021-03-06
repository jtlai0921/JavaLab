package CircularLinkedList;
import static java.lang.System.*;

//單向環狀鏈結串列
public class CircularList {
   Node first;
   public CircularList(){//建構式
      first = null;
   }

   //輸出節點
   public void display(){
      Node current;   //指向目前節點
      
      if (first == null)
         out.println("鏈結串列是空的");
      else{
         current = first; //從第一個節點開始準備走訪串列
         
         //串列有節點的情形下才讀取節點
         while (current != null){
            out.printf("[%d]->", current.item);
            current = current.next;
            if (current == first)
               break;
         }
         out.println();
      }
   }

   //新增節點到最後一個節點之後
   public void addLast(int data){
      //指向目前節點的參考current
      Node current;

      //如果第一個節點first是空的，就把新節點設為第一個節點
      if (first == null){
         first = new Node(data);
         first.next = first;
      }
      else{   //有第一個節點就以while廻圈走訪
         Node newNode = new Node(data);
         current = first;
         //走訪串列到最後節點
         while (current.next != first)
            current = current.next;
         //1.目前節點的Next指標指向新節點
         current.next = newNode;
         //2.新節點的Next指標指向第一個節點
         newNode.next = first;
      }
   }

   //新增節點到第一個節點之前
   public void addFirst(int data){
      //產生新節點newNode，把新節點鏈結next指向第一個節點first
      Node newNode = new Node(data);
      newNode.next = first;
      //目前節點參考指向第一個節點
      Node current = first;
      if (first == null)
         newNode.next = newNode;
      else{
         //1.目前節點鏈結next未指向第一個節點的情形下才走訪
         while (current.next != first)
            current = current.next;
         //2.目前節點的next鏈結指向新節點
         current.next = newNode;
      }
      first = newNode;   //3.設新節點為第一個節點
   }

   //刪除 指定節點
   public void removeAt(int data){
      Node current, previous;
      //若第一個節點被刪除，指定下一個節點為第一個節點
      if (first.item == data){
         current = first;
         while (current.next != first)
            current = current.next;
         out.printf("節點[%d]已被移除", first.item);
         //1.將目前節點next鏈結指向第二個節點
         current.next = first.next;
         //2.變更第二個節點為第一個節點
         first = first.next;
      }
      else {//情形二：首節點以外的節點要被刪除
         current = first;

         //目前節點next鏈結未指向第一個節點情形做走訪
         while(current.next != first){
            previous = current; //從目前節點的前一個節點開始
            current = current.next;
            if(current.item == data){
               //1.被刪節點的前一個節點，其next鏈結指向被刪節點的下一個節點
               previous.next = current.next;
               //2.移向下一個節點
               current = current.next;
            }
         }
      }
   }
}
