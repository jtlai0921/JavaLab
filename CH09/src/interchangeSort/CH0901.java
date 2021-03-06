package interchangeSort;
import static java.lang.System.*;

//氣泡排序法做遞增排序
public class CH0901 {
   public static void main(String[] args) {
      int[] number = { 25, 33, 11, 514, 78, 65, 57, 321 };
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      Sorting(number, len);//呼叫靜態方法做氣泡排序

      out.println("\n** 氣泡排序法 **");
      for (int j = 0; j < len; j++)
         out.printf("%-4d", number[j]);
   }

   //定義靜態方法 - 氣泡排序
   static void Sorting(int[] ary, int num){
      int j, k, tmp;
      for (j = num - 1; j >= 1; j--){
         for (k = 0; k <= j - 1; k++){
            //Step 1. 將相鄰的兩個元素互相比較
            //Step 2. 兩個元素互換，值大者向前利
            //Step 3. 重覆前述兩個步驟，直到無法互換為止
            if (ary[k] > ary[k + 1]){
               tmp = ary[k];
               ary[k] = ary[k + 1];
               ary[k + 1] = tmp;
            }
            //out.printf("\n[%d] = %d", k, ary[k]); //輸出排序過程
         }
      }
   }
}
