package Lab0404;

public class SingleLinked {
	Node first;     //指向第一個節點的參考
	int size = 0;   //統計節點數

	//新節點加到第一個節點之前
	public void addHead(int value) {
	   Node newNode = new Node(value);
	   newNode.next = first;
	   first = newNode;
	   size++;
	}

   //輸出節點
   public void show(){
      Node current = first;
      while(current!= null){
         System.out.printf("[%d]->", current.item);
         current = current.next;
      }
      System.out.println();
   }
}
