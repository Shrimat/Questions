public class GenericStackArray<T> implements GenericStack<T> {
  private int size;
  private T[] items;
  private static final int CAPACITY = 100;

  // Creates an empty T stack
  @SuppressWarnings("unchecked")
  public GenericStackArray() {
    this.items = (T[]) new Object[CAPACITY];
    this.size = 0;
  }

  // If the stack is full, does nothing.
  // Otherwise, pushes the given T on to the top of the stack
  @Override
  public void push(T s) {
    if (size < CAPACITY) {
      shiftRight();
      items[0] = s;
      size++;
    }
  }

  private void shiftRight() {
    if (size >= 0) System.arraycopy(items, 0, items, 1, size);
  }

  // If the stack is empty, leaves the stack unchanged and returns
  // null.  Otherwise, removes the T that is on the top of
  // the stack and returns it
  @Override
  public T pop() {
    if (isEmpty()) {
      return null;
    } else {
      T returnVal = items[0];
      shiftLeft();
      size--;
      return returnVal;
    }
  }

  private void shiftLeft() {
    if (size - 1 >= 0) System.arraycopy(items, 1, items, 0, size - 1);
  }

  // Returns true iff the stack is empty
  @Override
  public boolean isEmpty() {
    return size == 0;
  }

}
