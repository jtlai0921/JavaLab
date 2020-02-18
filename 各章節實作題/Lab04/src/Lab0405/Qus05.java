package Lab0405;
import static java.lang.System.*;

//第四章習題(二)，Q<5>
public class Qus05 {

   public static void main(String[] args) {
      CircularSLinked list = new CircularSLinked();

      int[] data = { 78, 122, 43, 517, 63 };
      out.println("輸出單向環狀鏈結串列");
      for (int item : data)
         list.addLast(item);
      list.display();

      out.print("移除第一個節點 --> ");
      list.removeFirst();
      list.display();
   }
}
