import static java.lang.System.out;

//第10章(二)-<Q1>
public class Lab1001 {
   public static void main(String[] args) {
      int[] number = { 179, 91, 86, 76, 97, 217,
            57, 87, 56, 66, 433, 24 };
      int min = smallValue(number);
      out.printf("最小值 = %d", min);
   }

   static int smallValue(int[] ary){
      int smallest, j;
      smallest = ary[0]; //先設第一個元素是最小值

      for (j = 0; j < 12; j++){
         if (ary[j] < smallest)
            smallest = ary[j];
      }
      return smallest;
   }
}
