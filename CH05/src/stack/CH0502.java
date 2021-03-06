package stack;
import static java.lang.System.*;

//以鏈結串列實作堆疊
public class CH0502 {
   public static void main(String[] args) {
      int[] fruit = {65, 321, 47, 128};
      LinkedList stack = new LinkedList();

      //從堆疊頂端壓入元素
      out.println("從堆疊頂端壓入元素");
      for(int item : fruit)
         stack.pushItem(item);
      stack.Display();

      //從堆疊頂端彈出元素
      stack.peekItem();
      stack.popItem();
      out.print("堆疊元素 --> ");
      stack.Display();
   }
}
