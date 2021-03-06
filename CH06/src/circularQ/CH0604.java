package circularQ;
import static java.lang.System.*;
import java.util.Scanner;

//實作環狀佇列
public class CH0604 {
   public static void main(String[] args) {
      AryCircular queue = new AryCircular();
      Scanner input = new Scanner(in);
      int[] data = {11, 23, 33, 44};
      int len = data.length;//取得陣列長度

      for (int j = 0; j < len; j++)
         queue.Enqueue(data[j]);
      out.print("佇項 --> ");
      queue.Display();

      out.print("新增 佇項項目 --> ");
      int num = input.nextInt();
      queue.Enqueue(num);
      queue.Display();

      out.print("刪除項目 --> ");
      queue.Dequeue();      
      queue.Dequeue();
      queue.Dequeue();
      queue.Dequeue();
      queue.Dequeue();
      out.print("\n佇列項目 ");
      queue.Display();

      input.close();
   }
}
