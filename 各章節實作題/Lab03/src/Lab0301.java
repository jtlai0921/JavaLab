import static java.lang.System.out;

//第3章(二)-<Q1>
public class Lab0301 {
   public static void main(String[] args) {
      String[] name =
         { "Peter", "Michelle", "Tom", "Rhodes", "Charles" };
      int len = 0;

      //加強式for廻圈
      for(String item : name) {
         len = item.length();//length()方法取得字串長度
         out.printf("%9s, 長度 = %d%n", item, len); 
      }
   }
}
