import static java.lang.System.*;

//第9章(二)-<Q1>
public class Lab0901 {
   public static void main(String[] args) {
      int[] number = {25, 33, 11, 514, 78, 65, 57, 321};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      Sorting(number, len);//呼叫靜態方法進行氣泡排序

      out.println("\n** 氣泡排序法做改善 **");
      for (int elem : number)
         out.printf("%-4d", elem);
   }

   //定義靜態方法做氣泡排序
   static void Sorting(int[] ary, int num){
      int j, k, tmp;
      boolean flag = true;
      for (j = num - 1; (j >= 1 && flag); j--){
         flag = false;
         for (k = 0; k <= j - 1; k++){
            if (ary[k] > ary[k + 1]){
               tmp = ary[k];
               ary[k] = ary[k + 1];
               ary[k + 1] = tmp;
               flag = true;
            }
            out.printf("ary[%d] = %d%n", k, ary[k]);
         }
      }
   }
}
