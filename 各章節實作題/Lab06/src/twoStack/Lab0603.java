package twoStack;
import static java.lang.System.out;

//第6章(二)-<Q3>實作佇列
public class Lab0603 {
   public static void main(String[] args) {
      var queue = new QueuewithStk<>();
      int[] data = { 12, 4, 36, 48, 60 };
      //新增項目到堆疊裡
      for(int item : data)
         queue.Enqueue(item);
      out.print("移除佇列項目 > ");
      //連續移除三個項目
      for (int j = 0; j < 3; j++)
         out.printf("%3d", queue.Dequeue());
   }
}
