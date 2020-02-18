package queue;
import static java.lang.System.*;

//以陣列結構定義佇列
public class AryforQueue {
   int[] list;  //儲存佇列項目
   private int rear, front, size;     //指向佇列前端、後端的參考
   private static final int Capacity  = 10;  //佇列預設的容量

   //建構式
   AryforQueue(){
      list = new int[Capacity];
      this.size = 0;
      this.rear = 0;
      this.front = 0;
   }

   //檢查佇列是否是空的
   public boolean isEmpty() {
      if (front == rear) 
         return true;
      else
         return false;
   }

   //檢查佇列是否已滿
   public boolean isFull() {return (size == Capacity);}

   //回傳佇列大小
   public int size() {return size;}

   //定義成員方法，把資料從佇列後端存入
   public void Enqueue(int data) {
      if (rear == Capacity)  //判斷是否大於佇列大小
         out.println("佇列已滿,無法再加入");
      else {
         list[rear] = data; //將資料存入佇列
         rear++;
         size++;
      }
   }

   //定義成員方法，把資料從佇列前端移除
   public int Dequeue(){
      if(isEmpty()) //判斷佇列是否為空的,如果是則傳回-1值
         return -1;
      else {
         size--;
         front++;
         return list[front];
      }
   }

   //定義成員方法，輸出佇列項目
   public void Display(){
      //out.println(list.length);
      for (int j = front; j != rear; j++)
         out.printf("%4d", list[j]);
      //out.println();
      out.printf(", Size = %d%n", size());
   }
}
