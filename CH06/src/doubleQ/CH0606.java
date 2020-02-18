package doubleQ;
import static java.lang.System.*;

//實作雙向佇列 - 輸入限制性雙佇列
public class CH0606 {
   public static void main(String[] args) {
      OutputQueue deque = new OutputQueue();

      int[] num1 = {44, 55, 66};
      int[] num2 = {33, 22, 11};

      for(int item : num1)
         deque.tailEnqueue(item);
      out.print("新增於佇列後端 --> ");
      deque.Display();

      for(int item : num2)
         deque.headEnqueue(item);
      out.print("新增於佇列前端 --> ");
      deque.Display();

      out.print("前端節點 ");
      deque.Dequeue();
      deque.Dequeue();
      out.print("已除移");
      out.print("\n佇列項目 ");
      deque.Display();
   }
}
