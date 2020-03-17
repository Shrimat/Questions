import java.util.LinkedList;
import java.util.List;

public class GenericStackList<T> implements GenericStack<T> {
  private List<T> list;

  public GenericStackList() {
    this.list = new LinkedList<>();
  }

  // Pushes the given T on to the top of the stack
  @Override
  public void push(T s) {
    list.add(0, s);
  }

  // If the stack is empty, leaves the stack unchanged and returns
  // null.  Otherwise, removes the T that is on the top of
  // the stack and returns it
  @Override
  public T pop() {
    if (isEmpty()) {
      return null;
    } else {
      return list.remove(0);
    }
  }

  // Returns true iff the stack is empty
  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

}
