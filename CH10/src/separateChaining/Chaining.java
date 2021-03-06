package separateChaining;
import static java.lang.System.*;

//定義分隔鏈結
public class Chaining {
   final static int PRIME = 13; //設定質數
   static Node[] hash = new Node[PRIME];  //儲存雜湊值的雜湊表

   //清空雜湊表，將串列的節點初始化為null
   Chaining(){
      for (int j = 0; j < PRIME; j++)
         hash[j] = null;
   }

   //建立雜湊函數-採用運算式主體-依傳入值取得餘數
   public int runHash(int num) {
      int result = num % PRIME;
      return result;
   }

   //定義方法-產生雜湊表
   public void createHT(int key){
      Node ptr = new Node();
      Node newNode = new Node();   //初始化start節點
         newNode.item = key;
         newNode.next = null;

      int pos = runHash(key);  //呼叫雜湊函數取得位置
      ptr = hash[pos];

      if (ptr != null){
         newNode.next = ptr;  //目前節點參考ptr指向新節點的下一個節點
         hash[pos] = newNode; //新節點資料存入hast陣列
      }
      else
         hash[pos] = newNode; //以新節點為首節點
   }

   //定義方法查找鍵值回到位置pos
   public int searchHash(int key){
      Node ptr;
      int pos = runHash(key);
      ptr = hash[pos];

      //沒有找到就回傳-1
      if (ptr == null)
         return -1;

      while (ptr.next != null && ptr.item != key)
         ptr = ptr.next;
      return pos;
   }

   //輸出串列內容
   public void display(){
      Node ptr;
      for (int j = 0; j < PRIME; j++){
         out.printf("%n[%2d]-> ", j);
         ptr = hash[j];
         while (ptr != null){
            out.printf("|%3d|", ptr.item);
            ptr = ptr.next;
         }
      }
   }
}
