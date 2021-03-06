package queue;
import java.util.*;
import static java.lang.System.*;

//介面Queue以LinkedList實作
public class CH0603{
   public static void main(String[] args) {
      Queue<String> queue = new LinkedList<String>();
      String[] weeks = {
            "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
      //offer()方法將指定項目加入佇列
      for(String item : weeks)
         queue.offer(item); //將項目新增佇列尾端
      out.println("--佇列項目--");
      Display(queue);
      out.printf("%n佇列第一個項目  [%s]%n", queue.element());
      out.printf("移除佇列第一個項目  [%s]%n", queue.remove());
      Display(queue);
   }

   //輸出佇列項目
   public static void Display(Queue<String> items) {
      for(String item : items)
         out.printf("%-5s", item);
   }
}
