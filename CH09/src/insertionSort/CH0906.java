package insertionSort;
import static java.lang.System.*;

//使用謝耳排序法做遞增排序
public class CH0906 {
   public static void main(String[] args){
      int[] number = {145, 231, 10, 314, 17, 452, 78, 63, 39, 276};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      shellSort(number, len);//呼叫靜態方法做排序

      out.println("\n** 謝耳排序法  **");
      for (int j = 0; j < len; j++)
         out.printf("%-4d", number[j]);
   }

   //定義靜態方法做謝耳排序
   static void shellSort(int[] ary, int num){
      int j, k, offset, item;
      offset = num / 2; //開始間隔值5, 10­個元素分5組

      while (offset != 0){
         //依間隔值產生插入式排序
         for (j = offset; j < num; j++){
            item = ary[j]; //欲插入元素
            k = j;

            while (k >= offset && item < ary[k - offset]){
               ary[k] = ary[k - offset];
               k -= offset;
            }
            ary[k] = item;  //插入元素
         }
         offset /= 2; //取得下一個間隔值
      }
   }
}
