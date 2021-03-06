import static java.lang.System.out;

//認識String建構函式，建立字串，將字元陣列以字串輸出
public class CH0315 {
   public static void main(String[] args) {
      char[] one = {
            'H', 'a', 'p', 'p', 'y', ' ', 't', 'i', 'm', 'e'};
      String word = new String("Masterpiece");
      String st1 = new String();   //空字串
      String st2 = new String(word);
      String st3 = new String(one);
      String st4 = new String(one, 6, 4);

      out.printf("st1 = %s%n st2 = %s%n st3 = %s%n st4 = %s%n", 
            st1, st2, st3, st4);

      //配合charAt()方法將字串反轉
      for(int count = word.length() - 1; count >= 0; count--)
         out.printf("%c", word.charAt(count));

      //把兩個字串比較其ASCII的值
      out.printf("%nword.compareTo(st2) is %d", 
         word.compareTo(st2)); //回傳0
      out.printf("%nst2.compareTo(st3) is %d", 
         st2.compareTo(st3));
      out.printf("%nst3.compareTo(st2) is %d%n", 
         st3.compareTo(st2));

      //indexOf()方法-取得字串中某個字元的位置
      out.printf("字元 e之索引 : %d%n", word.indexOf('e'));

      //方法getChars()把字串中的部份字串，經由複製而變成字元陣列
      char[] two = new char[6];//宣告字元陣列並配置記憶體
      word.getChars(2, 7, two, 1);
      for(char ch : two)
         out.printf("%c ", ch);

      //方法substring()可指定索引範圍來取得子字串
      out.println("從索引5開始-->" + st3.substring(5));
      out.println("索引2~8-->" + st3.substring(2, 8));
   }
}
