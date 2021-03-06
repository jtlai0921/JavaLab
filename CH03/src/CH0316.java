import static java.lang.System.out;

//利用StringBuffer類別之建構式儲存字串
public class CH0316 {
   public static void main(String[] args) {
      StringBuilder buffer = new StringBuilder("Last summer!");
      out.printf("字串: %s%n長度  = %d%n字串容量  = %d%n%n",
         buffer.toString(), buffer.length(), buffer.capacity());

      //將字元陣列和字串新增到sentence字串物件
      char[] one = {'A', 'n', ' ', 'a', 'p', 'p', 'l', 'e'};
      String word = " a day keeps the doctor away.";
      String sentence = new 
         StringBuffer().append(one).append(word).toString();
      out.println(sentence);

      //方法getChars()複製到新的字元陣列，方法setCharAt()修改指定字元
      char[] two = new char[16];  //空的字元陣列，長度為16
      buffer.getChars(0, buffer.length(), two, 0);
      out.printf("第一個字元 -> %c%n", buffer.charAt(0));
      for(char single : two)
         out.printf("%c ", single);
      buffer.setCharAt(5, 'S');
      out.printf("%n%s", buffer.toString());

   }
}