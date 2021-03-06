import static java.lang.System.out;

//把各科成績轉化為二維陣列，求得總分
public class CH0306 {
   public static void main(String[] args) {
      int row, col;      //巢狀for的計數器
      int[] sum = new int[3];//存放每個人的總分

      String[] student = { "Mary", "Tomas", "John" };
      for(String item : student) //讀取名字
         out.printf("%8s", item);//設欄寬為8來輸出
      out.println();

      int[][] score = {{75, 64, 96}, 
                       {55, 67, 39},
                       {45, 92, 85},
                       {71, 69, 81} };

      //外層for廻圈讀取列之後，再由內層for廻圈讀取每列的欄元素
      for (row = 0; row < score.length; row++){
         for (col = 0; col < score[row].length; col++)
            out.printf("%8d", score[row][col]);
         out.println();
         sum[0] += score[row][0];//第1欄分數相加
         sum[1] += score[row][1];//第2欄分數相加
         sum[2] += score[row][2];//第3欄分數相加
      }

      out.println("-------------------------");
      out.printf("合計: %3d %7d %6d",
            sum[0], sum[1], sum[2]);

   }
}
