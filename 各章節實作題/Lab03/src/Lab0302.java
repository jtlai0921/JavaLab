import static java.lang.System.out;

//第3章(二)-<Q2>
public class Lab0302 {
   public static void main(String[] args) {
      String[] course = {"國文", "英文", "數學", "總分"};

      //讀取科目並輸出
      for (String item : course)
         out.printf("%5s", item);
      out.println();

      //宣告二維陣列並初始化
      int[][] score = {{85, 78, 66, 0},
                       {95, 88, 79, 0},
                       {84, 76, 67, 0}, 
                       {81, 73, 54, 0} };

      //for廻圈讀取二維陣列
      for(int j = 0; j < score.length; j++) {
         //分別讀取每列的分數並加總
         for(int k = 0; k < score[j].length - 1; k++) {
            score[0][3] = score[0][0] + score[0][1] + score[0][2];
            score[1][3] = score[1][0] + score[1][1] + score[1][2];
            score[2][3] = score[2][0] + score[2][1] + score[2][2];
            score[3][3] = score[3][0] + score[3][1] + score[3][2];
         }
         //再一次讀取每列的分數並輸出
         for(int item = 0; item < score[j].length; item++)
            out.printf("%5d", score[j][item]);
         out.println();
      }
   }
}
