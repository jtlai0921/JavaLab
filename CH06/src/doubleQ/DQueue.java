package doubleQ;
import static java.lang.System.*;

//以陣列結構定義輸入限制性雙向佇列
public class DQueue {
   private static final int maxSize = 6;  //佇列最大空間
   int[] list;  //儲存佇列項目
   int rear, front, count;    //指向佇列後端、前端參考，計算佇列項目數

   //建構式
   DQueue(){
      list = new int[maxSize];
      this.rear = -1;
      this.front = 0;
      this.count = 0;
   }
   //定義方法-判斷是否為空的佇列，使用運算式主體
   public boolean IsEmpty() {return (count == 0);}

   //定義方法-判斷是否為滿的佇列，使用運算式主體
   public boolean IsFull() {return (count == maxSize);}

   //定義成員方法，把資料從佇列後端存入
   public void Enqueue(int data){
      if (!IsFull()){
         rear++;
         list[rear] = data;
          count++;
      }
      else
         out.println("佇列已滿");
   }

   //定義成員方法，把資料從佇列前端移除再變更Front參考
   public void headDequeue(){
      if (IsEmpty())
         out.println("空的佇列，無法刪除項目");
      else{
         out.printf("項目[%d]已移除", list[front]);
         front++;
         count--;
      }
   }

   //定義成員方法，把資料從佇列後端移除再變更Rear參考
   public void tailDequeue(){
      if (IsEmpty())
         out.println("空的佇列，無法刪除項目");
      else {
         out.printf("項目[%d]已移除", list[rear]);
         rear--;
         count--;
      }
   }

   //定義成員方法，輸出佇列項目
   public void Display(){
      for (int j = front; j < count + front; j++)
         out.printf("%4d", list[j % maxSize]);
      out.println();
      out.printf("Front<%d>, Rear<%d>, Count = %d%n",
            front, rear, count);
   }
}
