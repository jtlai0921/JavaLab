package bst;
import static java.lang.System.*;
import java.util.Scanner;

//查訪二元搜尋樹的節點
public class CH0705 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      Node first = null, search = null;
      BinarySearchTree sbtree = new BinarySearchTree();

      int[] ary = { 60, 25, 93, 34, 18, 79 };
      first = sbtree.createBTree(ary, ary.length);

      out.print("輸入欲查找的節點--> ");
      int target = input.nextInt();
      search = sbtree.FindBSTItemTo(first, target);
      if (search != null)
         out.printf("找到二元搜尋樹的節點--> %d", search.item);
      else
         out.printf("二元搜尋樹的節點[%d]沒有找到", target);
      input.close();
   }
}
