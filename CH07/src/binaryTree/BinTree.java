package binaryTree;
import static java.lang.System.*;

/* 產生的二元樹
      E            
     / \           
    D   F          
   /     \         
  B       H        
 / \     / \       
A   C   G   I      */

//雙向鏈結實作二元樹
public class BinTree {
   private Node root;

   //定義預設建構式--初始化根節點為空值
   public BinTree() {root = null;}

   //定義成員方法-產生二元樹
   public void CreateBTree(char[] ary, int len){
      for (int j = 0; j < len; j++)
         root = Appenditem(ary[j]);
   }

   //把節點新增到二元樹
   public Node Appenditem(char data){
      Node ptr, papa = null;
      Node newNode = new Node(data);
      newNode.item = data;
      newNode.Lnext = null;
      newNode.Rlink = null;

      if (root == null)
         return newNode;
      else {
         ptr = root;//設目前節點參考指向根節點

         //走訪二元樹
         while (ptr != null) {
            papa = ptr; //父節點參考papa
            //目前節點的值 > 接收的參數值
            if (ptr.item > data)
               ptr = ptr.Lnext; //指向左子節點
            else
               ptr = ptr.Rlink; //指向右子節點
         }
         //父節點的值 > 接收的參數值
         if (papa.item > data)
            papa.Lnext = newNode;  //新節點為左子節點
         else
            papa.Rlink = newNode;  //新節點為右子節點
      }
      return root;
   }

   public void Display(){
      Node ptr = root.Lnext;
      out.printf("根節點 <%c>%n", root.item);
      out.print("左子樹--> ");
      while (ptr != null){
         out.printf("[%c]", ptr.item);
         ptr = ptr.Lnext;
      }
      out.println();
      ptr = root.Rlink;
      out.print("右子樹--> ");
      while (ptr != null){
         out.printf("[%c]", ptr.item);
         ptr = ptr.Rlink;
      }
      out.println();
   }
}
