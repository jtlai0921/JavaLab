package Lab0405;
import static java.lang.System.*;

//�ĥ|�����D(�G)�AQ<5>
public class Qus05 {

   public static void main(String[] args) {
      CircularSLinked list = new CircularSLinked();

      int[] data = { 78, 122, 43, 517, 63 };
      out.println("��X��V�����쵲��C");
      for (int item : data)
         list.addLast(item);
      list.display();

      out.print("�����Ĥ@�Ӹ`�I --> ");
      list.removeFirst();
      list.display();
   }
}
