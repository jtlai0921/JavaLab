package selectionSort;
import static java.lang.System.*;

//使用堆積排序法做遞減排序
public class CH0908 {
   public static void main(String[] args) {
      int[] number = {58, 46, 72, 23, 130, 35, 12, 95};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      heapSort(number);//呼叫靜態方法做排序

      out.println("\n** 堆積排序法  **");
      for (int j = 0; j < len; j++)
         out.printf("%-4d", number[j]);
   }

   //定義靜態方法做排序
   static void heapSort(int[] ary){
      int length, index, k;
      length = ary.length - 1;
      index = length / 2;  //取得有子節點的父節點位置

      //從最後一個父節點開始，依據index將目前待排序調整為最大堆積樹
      for (k = index; k >= 0; k--)
         heapDown(ary, k, length);

      //走訪陣列，逐步把根節點(最大者)與最後一個節點互換，不斷調整最大堆積樹
      for (k = length; k > 0; k--){
         if (ary[0] > ary[k]){
            Swap(ary, 0, k);//呼叫靜態方法將兩個元素置換
            heapDown(ary, 0, k - 1);
         }
      }
   }

   //定義靜態方法來產生最大堆積樹
   static void heapDown(int[] ary, int first, int last){
      int large;
      //從子樹找出最大值並記錄其位置
      large = 2 * first + 1;

      //找出大兒子並向上移一層
      while (large <= last){
         if (large < last && ary[large] < ary[large + 1])
            large++;

         //­若大兒子大於父節點，兩者互換

         /*if(ary[large] > ary[first]){   //遞減
            Swap(ref ary, large, first);
            first = large;
            large = 2 * first + 1;
         }
         else
            break;*/

         if (ary[large] < ary[first])   //遞增
            break;
         else{
            Swap(ary, first, large);
            first = large;
            large = 2 * first + 1;
         }
      }
   }

   //定義靜態方法Swap()，將兩個元素互換
   static void Swap(int[] ary, int item1, int item2){
      int tmp = ary[item1];
      ary[item1] = ary[item2];
      ary[item2] = tmp;
   }
}
