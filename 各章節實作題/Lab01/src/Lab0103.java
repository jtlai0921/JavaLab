//第1章(二)-<Q3> -- 求取數值101 ~ 200偶數累加和
public class Lab0103 {
   public static void main(String[] args) {
      int count = 101;
      int total = 0;
      while(count <= 200){
         total += count;
         count += 2;
      }
      System.out.printf("101 ~ 200 偶數和: %d", total);
   }
}
