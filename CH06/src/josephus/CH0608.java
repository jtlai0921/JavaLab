package josephus;
import static java.lang.System.*;

//實作單向環狀鏈結串列
public class CH0608 {
   public static void main(String[] args) {
      CircularLinked list = new CircularLinked();
      int[] data = { 28, 67, 8, 31, 57, 100, 30, 73, 43, 54 };
      for(int item : data)
         list.Enqueue(item);
      out.println("環狀鏈結串列：");
      list.Display();
      list.Josephus(10, 3);
      out.println();
      out.print("勝出節點-->");
      list.Display();
   }
}
