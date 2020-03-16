import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringStackList implements StringStack {
  private List<String> stringList;

  public StringStackList() {
    this.stringList = new LinkedList<>();
  }


  //Pushes the given String on to the top of the stack
  @Override
  public void push(String s) {
    stringList.add(0, s);
  }


  // If the stack is empty, leaves the stack unchanged and returns
  // null.  Otherwise, removes the string that is on the top of
  // the stack and returns it
  @Override
  public String pop() {
    if (isEmpty()) {
      return null;
    } else {
      return stringList.remove(0);
    }
  }

  // Returns true iff the stack is empty
  @Override
  public boolean isEmpty() {
    return stringList.isEmpty();
  }
}
