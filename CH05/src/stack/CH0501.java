package stack;

public class CH0501 {
   public static void main(String[] args) {
      stackforArray stk = new stackforArray();
      stk.pushItem("Mary"); //把項目壓入堆疊
      stk.pushItem("Tomas");
      stk.pushItem("Vicky");
      stk.Display();       //輸出堆疊內容

      stk.popItem();       //把項目從堆端頂端彈出
      stk.popItem();
      stk.popItem();
      stk.Display();
   }
}
