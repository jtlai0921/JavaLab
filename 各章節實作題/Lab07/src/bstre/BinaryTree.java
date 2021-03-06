package bstre;
import static java.lang.System.out;

//第7章(二)-<Q2>以二元搜尋樹找出最小值
public class BinaryTree {
 //產生二元樹
   public void createBTree(int[] ary, int len){
      Node root = null;
      for (int j = 0; j < len; j++)
         root = appendItem(root, ary[j]);
   }

   //把節點新增到二元樹
   public Node appendItem(Node root, int data){
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
         while (ptr != null){
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

   /*  查訪二元搜尋樹的節點  */
   public Node findItem(Node root){
      Node ptr = root;
      while (ptr.Lnext != null)
         ptr = ptr.Lnext;
      return ptr;
   }

   //以中序走訪輸出二元樹
   public void Inorder(Node root){
      if (root != null)
      {
         Inorder(root.Lnext);             //1.先走訪左子樹
         out.printf("[%d]>", root.item);  //2.再拜訪樹根
         Inorder(root.Rlink);             //3.最後走訪右子樹
      }
   }
}
