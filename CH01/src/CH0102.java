import java.util.*; //使用Scanner類別
//java常數之使用

public class CH0102 {
   public static void main(String[] args) {
      final float Square = 3.0579F;
      System.out.print("請輸入坪數-->");
      //以Scanner類別之物件配合「System.in」取得輸入資料
      Scanner floor = new Scanner(System.in);
      //利用nextFloat()方法將輸入資料轉為float型別
      float number = floor.nextFloat();
      //把坪換算為平方公尺
      float area = number * Square;
      //printf()輸出格式化內容
      System.out.printf("%.2f 坪 = %.4f 平方公尺", 
            number, area);
      floor.close();
   }
}
