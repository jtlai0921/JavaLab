import static java.lang.System.out;

//第5章(二)-<Q8>將陣列的元素反轉
public class Lab0508 {
   public static void main(String[] args) {
      int[] ary = { 11, 22, 33, 44, 55, 66 };
      out.println("--讀取陣列--");
      for (int j = 0; j < 6; j++)
         out.printf(" %d ", ary[j]);
      out.println();

      out.println("\n**呼叫遞廻反轉陣列**");
      Reverst(ary, 0);
   }

   public static void Reverst(int[] ary, int num){
      if (num < ary.length){             //終止條件 
         //遞廻串列列印函數呼叫
         Reverst(ary, num + 1);
         out.printf(" %d ", ary[num]);
      }
   }
}
