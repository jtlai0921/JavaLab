package binaryTree;

//以雙向鏈結串列實作二元樹
public class CH0702 {
   public static void main(String[] args) {
      char[] ary = {'E', 'D', 'F', 'B', 'H', 'A', 'C', 'G', 'I'};
      BinTree btree = new BinTree();
      btree.CreateBTree(ary, ary.length);
      btree.Display();
   }
}