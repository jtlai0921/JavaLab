//加強式for廻圈讀取陣列

public class CH0302 {
   public static void main(String[] args) {
      int[] score = {98, 64, 71};//宣告一維陣列並初始化
      //加強式for廻圈
      for(int item : score)
         System.out.printf("%3d", item);
   }
}