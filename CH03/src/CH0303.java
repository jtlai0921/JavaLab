//for廻圈讀取陣列，內建屬性length取得陣列長度

public class CH0303 {
   public static void main(String[] args) {
      //宣告一維陣列並以大括號初始化其內容
      int[] score = {95, 68, 84, 76};
      int total = 0;
      for(int j = 0; j < score.length; j++)
         total += score[j];
      System.out.println("總分 = " + total);
   }
}