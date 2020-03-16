public class Demo {

  public static void main(String[] args) {
   StringStack stack1 = new StringStackArray();
   StringStack stack2 = new StringStackList();

   stack1.push("Shrimat");
   stack1.push("Yuang");
   stack1.push("Matteo");
   stack1.push("Michael");
   stack1.push("Ibraheem");
   stack1.push("Yash");
   stack1.push("Andrei");
   stack1.push("Georgi");

   transferStacks(stack2, stack1);

   assert stack1.isEmpty();

   while (!stack2.isEmpty()) {
     System.out.println(stack2.pop());
   }
  }


  //This is an elegant method because it can use interface methods but apply on different classes
  public static void transferStacks(StringStack dst, StringStack src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }
}
