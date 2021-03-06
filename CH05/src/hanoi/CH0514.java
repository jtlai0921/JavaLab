package hanoi;
import static java.lang.System.*;

//河內塔
public class CH0514 {
   public static void main(String[] args) {
      Hanoi(3, 'A', 'B', 'C');
   }

   //定義靜態方法-
   public static void Hanoi(int num, char start, char tmp, char target){
      if (num == 1)   //終止條件
         out.printf("移動第 %d 圓盤，從 %c --> %c%n", num, start, target);
      else {
         Hanoi(num - 1, start, target, tmp);
         out.printf("移動第 %d 圓盤，從 %c --> %c%n", num, start, target);
         Hanoi(num - 1, tmp, start, target);
      }
   }
}
