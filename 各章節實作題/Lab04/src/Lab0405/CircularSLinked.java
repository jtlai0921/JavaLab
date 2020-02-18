package Lab0405;
import static java.lang.System.*;

public class CircularSLinked {
   Node first, last;
   public CircularSLinked(){ //�غc��
      first = null;
      last = null;
   }

   //��X�`�I
   public void display(){
      Node current;   //���V�ثe�`�I

      if (first == null)
         out.println("�쵲��C�O�Ū�");
      current = first; //�q�Ĥ@�Ӹ`�I�}�l�ǳƨ��X��C

      //��C���`�I�����ΤU�~Ū���`�I
      while (current != null){
         out.printf("[%d]->", current.item);
         current = current.next;
         if (current == last)
            break;
      }
      out.printf("[%d]->null", current.item);
      out.println();
   }

   //�s�W�`�I��̫�@�Ӹ`�I����
   public void addLast(int data){
      Node newNode = new Node(data);
      //�p�G�̫�`�Ilast�O�Ū��A�N��s�`�I�]���Ĥ@�ӡB�̫�`�I
      if (last == null){
         first = newNode;
         last = newNode;
      }
      else {
         //1.�̫�`�I��Next�Ѧҫ��V�s�`�I
         last.next = newNode;
         //2.�s�`�I�쵲Next���V�̫�`�I
         newNode.next = last;
         //3.�̫�`�I�Ѧҫ��V�s�`�I
         last = newNode;
      }
   }

   //�w�q������k-�����Ĥ@�Ӹ`�I
   public void removeFirst(){
      //�Y�Ĥ@�Ӹ`�I�Q�R���A���w�U�@�Ӹ`�I���Ĥ@�Ӹ`�I
      Node current = first;

      while (current.next != first){
         //out.println(current.item);
         current = current.next;
         if (current == last)
            break;
      }
      out.printf("�`�I [%d] �w�Q����\n", first.item);
      //1.�N�ثe�`�INext�쵲���V�ĤG�Ӹ`�I
      current.next = first.next;
      //2.�ܧ�ĤG�Ӹ`�I���Ĥ@�Ӹ`�I
      first = first.next;
   }
}