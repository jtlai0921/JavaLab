import static java.lang.System.out;

//讀取不規則陣列
public class CH0308 {
   public static void main(String[] args) {
      //宣告不規則陣列並初始化
      String[][] course = new String[][]{
         new String[]{"Peter", "英文會話", "程式設計", "國文"},
         new String[]{"Charles", "國文", " 計算機概論"},
         new String[]
          {"Johnson", "多媒體論", "應用文", "英文", "數學"}
      };

      //加強式for廻圈讀取陣列
      for(String one[] : course){   //讀取列
         for (String item : one)    //讀取每列的欄元素
            out.printf("%s\t", item); 
         out.println();
      }
   }
}