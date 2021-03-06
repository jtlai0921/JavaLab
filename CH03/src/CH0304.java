import static java.lang.System.out;
import java.util.*;

//以Arrays.sort()方法做遞增排序
public class CH0304 {
   public static void main(String[] args) {
      //宣告陣列並初始化元素
      int[] number = { 82, 173, 124, 58 };

      out.print("排序前：");
      for(int element : number)
         out.printf("%4d", element);

      Arrays.sort(number);  //sort()方法遞增排序

      out.print("\n遞增排序：");
      for (int item = 0; item < number.length; item++) 
         out.printf("%4d", number[item]);
      out.println();
   }
}