import static java.lang.System.out;
import java.util.*;

//第5章(二)-<Q2>以堆疊結構反轉陣列
public class Lab0502{
   public static void main(String[] args) {
      //List介面產生靜態集合
      var source = List.of("One", "Two", "Three", "Four");

      //產生ArrayList物件來存放source, 呼叫add()方法加入元素
      var word = new ArrayList<>();
      for(var item : source)
         word.add(item);
      //以LinkedList類別實作List介面
      var stack = new LinkedList<>(word);
      var target = new ArrayList<>();
      out.print("取出堆疊頂端元素 >> ");
      //呼叫removeLast()方法取出鏈結串列頂端元素加到target
      while(true) {
         var data = stack.removeLast();
         target.add(data);
         out.printf("%-6s", data);         
         if(stack.isEmpty()) break;
      }
      out.print("\nTarget 存放的元素 --> ");
      for(var item : target)
         out.printf(" %s ", item);
   }
}
