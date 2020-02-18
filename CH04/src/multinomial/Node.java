package multinomial;

public class Node {
   int coef;    //多項式非零係數
   int exp;     //多項式指數
   Node next;   //指向下一個節點

   Node(){}     //建構式

   Node(int data, int pow){   //建構式
      this.coef = data;
      this.exp = pow;
      this.next = null;
   }
}
