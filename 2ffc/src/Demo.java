import java.io.PrintStream;

public class Demo {
  public static void main(String[] args) {
    //Example 1 with type: String
    GenericStack<String> stack1 = new GenericStackArray<>();
    GenericStack<String> stack2 = new GenericStackList<>();

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

    //Example 2 with type: PrintStream
    GenericStack<PrintStream> stack3 = new GenericStackArray<>();
    GenericStack<PrintStream> stack4 = new GenericStackList<>();

    PrintStream ps1 = new PrintStream(System.out);
    PrintStream ps2 = new PrintStream(System.out);


    stack3.push(ps1);
    stack3.push(ps2);

    transferStacks(stack4, stack3);

    assert stack3.isEmpty();

    while (!stack4.isEmpty()) {
      System.out.println(stack4.pop());
    }

  }

  public static <T> void transferStacks(GenericStack<T> dst, GenericStack<T> src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }
}
