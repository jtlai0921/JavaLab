//第2章-<2>Q5
public class Lab0205 {
   public static void main(String[] args) {
      int total = 0;
      System.out.print("100 ~ 200 之和 -> ");
      for (int j = 100; j <= 200; j++){
         if (j % 2 == 1)               
            total += j;               
      }
      System.out.printf("%d", total);
   }
}
