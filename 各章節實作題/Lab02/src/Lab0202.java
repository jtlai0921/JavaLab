import static java.lang.System.*;

//第2章-<2>Q2
public class Lab0202{
   public static void main(String[] args) {
      String st1 = "Tomas";
      int[] sc1 = { 78, 65, 92, 84, 43 };
      String st2 = "Vicky";
      int[] sc2 = { 61, 52, 45, 79, 86 };
      String st3 = "Peter";
      int[] sc3 = { 97, 82, 53, 65, 65 };
      getScore(st1, sc1, sc1.length);
      getScore(st2, sc2, sc2.length);
      getScore(st3, sc3, sc3.length);
   }

   //定義靜態方法
   static void getScore(String name, int[] score, int course) {
      out.printf("Hi! %s, ", name);
      int total = 0;
      float avg;
      for (int j = 0; j < 5; j++){
         total += score[j];
      }
      avg = total / (float)course;
      if(avg >= 60)
         out.printf("總分: %d, 平均:  %.3f%n", total, avg);
      else
         out.printf("總分: %d, 平均:  %.3f%n", total, avg);
   }
}