package traversalBTree;
import static java.lang.System.*;
import binaryTree.Node;

//樹的走訪
public class CH0703 {
   public static void main(String[] args) {
      char[] ary = {'E', 'F', 'D', 'H', 'B', 'C', 'G', 'A', 'I'};
      int len = ary.length;
      BinaryTree bree = new BinaryTree();
      Node first = bree.createBTree(ary, len);

      out.println("--------前序走訪二元樹--------");
      bree.Preorder(first);

      out.println("\n\n--------中序走訪二元樹--------");
      bree.Inorder(first);

      out.println("\n\n--------後序走訪二元樹--------");
      bree.Postorder(first);
   }
}
