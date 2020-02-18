package Lab0405;

public class Node {
	int item;         //資料欄
	Node next;        //指向下一個節點

	Node(int data){   //建構式
	   this.item = data;
	   this.next = null;
	}
}