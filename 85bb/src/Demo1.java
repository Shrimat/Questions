public class Demo1 {
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

    System.out.println(stack1);
    System.out.println(stack2);

    transferStacks(stack2, stack1);

    System.out.println(stack1);
    System.out.println(stack2);
  }

  public static void transferStacks(StringStack dst, StringStack src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }
}
