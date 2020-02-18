package Lab0404;

public class SingleLinked {
	Node first;     //���V�Ĥ@�Ӹ`�I���Ѧ�
	int size = 0;   //�έp�`�I��

	//�s�`�I�[��Ĥ@�Ӹ`�I���e
	public void addHead(int value) {
	   Node newNode = new Node(value);
	   newNode.next = first;
	   first = newNode;
	   size++;
	}

   //��X�`�I
   public void show(){
      Node current = first;
      while(current!= null){
         System.out.printf("[%d]->", current.item);
         current = current.next;
      }
      System.out.println();
   }
}
