package radixSort;
import static java.lang.System.out;

//使用基排序法做排序
public class CH0910 {
   static final int BASE = 10;
   public static void main(String[] args) {
      int[] number = {59, 93, 17, 24, 70, 8, 185, 264, 566, 1155, 86, 1351};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf(" %d ", item);
      out.println();

      radixSort(number, len);//呼叫靜態方法做排序

      out.println("\n** 基數排序法  **");
      for (int j = 0; j < len; j++)
         out.printf(" %d ", number[j]);
   }

   //定義靜態方法做排序
   static void radixSort(int[] ary, int len){
      //產生桶子data, count存放鍵值出現的次數
      int[][] data = new int[BASE][len];
      int[] count = new int[len];
      int j, num, amass, bucket, max, round;
      int efn = 0, figure = 1;
      max = BigValue(ary, len); //呼叫靜態方法取得最大值

      while(max > 0){ //取得最大位數
         efn++;
         max /= BASE;
      }

      for(round = 0; round < efn; round++){ //初始化桶子
         for(j = 0; j < BASE; j++)   //清空桶子
            count[j] = 0;

         for(j = 0; j<len; j++){   //依據個、十、百、千位數分配
            /* 依LSD方式將元素依個、十、百、千位數，將計算所得餘數分別放入0~9的桶子
               Ex: count[3] = 2 表示3號桶子有2個元素 */
            bucket = (ary[j] / figure) % BASE;   //所得餘數存入0~9桶子
            data[bucket][count[bucket]] = ary[j];
            count[bucket] += 1; //統計累計的元素
         }

         j = 0;
         for(num = 0; num<BASE; num++){ //依位數做合併
            for(amass = 0; amass<count[num]; amass++){
               /* Ex: ary[9] = 17, data[7, 0]
                                               表示元素17分配在[7]號桶子第[0]個位置，只累積1個項目 */
               ary[j] = data[num][amass];
               out.printf("ary[%2d] = %4d, ", j, ary[j]); //查看個、拾、百、仟合併結果
               j++;
               out.printf("data[%d][%d] = %4d%n", 
                     num, amass, data[num][amass]);  
            }
         }
         figure *= BASE;  //取得位數
      }
   }

   //定義靜態方法找出最大位數的項目
   static int BigValue(int[] ary, int length){
      int j;
      int max = ary[0];

      for (j = 0; j < length; j++){
         if (ary[j] > max)
            max = ary[j];
      }
      return max;
   }
}
