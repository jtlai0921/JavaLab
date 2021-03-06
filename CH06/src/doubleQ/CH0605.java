package doubleQ;
import static java.lang.System.*;
import java.util.Scanner;

//實作雙向佇列 - 輸入限制性雙佇列
public class CH0605 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      DQueue deque = new DQueue();

      int[] data = {11, 22, 33, 44, 55};

      for(int item : data)
         deque.Enqueue(item);
      out.print("佇列 --> ");
      deque.Display();

      out.print("佇列前端 --> ");
      deque.headDequeue();      
      out.print("\n佇列項目 ");
      deque.Display();

      out.print("佇列末端 --> ");
      deque.tailDequeue();      
      out.print("\n佇列項目 ");
      deque.Display();

      out.print("新增 佇項項目 --> ");
      int num = input.nextInt();
      deque.Enqueue(num);
      deque.Display();

      input.close();
   }
}
