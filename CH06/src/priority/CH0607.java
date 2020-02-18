package priority;
import static java.lang.System.*;

//實作優先佇列 
public class CH0607 {
   public static void main(String[] args) {
      PriQueue que = new PriQueue();
      que.Enqueue(78, 2);
      que.Enqueue(133, 5);
      que.Enqueue(93, 4);
      que.Enqueue(214, 3);
      que.Display();

      out.print("刪除 -> ");
      que.Dequeue();
      que.Display();
   }
}
