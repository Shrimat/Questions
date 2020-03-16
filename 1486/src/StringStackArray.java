public class StringStackArray implements StringStack {
  private int size;
  private String[] strings;
  private static final int CAPACITY = 100;

  // Creates an empty string stack
  public StringStackArray() {
    this.strings = new String[CAPACITY];
    this.size = 0;
  }

  // If the stack is full, does nothing.
  // Otherwise, pushes the given String on to the top of the stack
  @Override
  public void push(String s) {
    if (size < CAPACITY) {
      shiftRight();
      strings[0] = s;
      size++;
    }
  }

  private void shiftRight() {
    for (int i = size; i > 0; i--) {
      strings[i] = strings[i-1];
    }
  }

  // If the stack is empty, leaves the stack unchanged and returns
  // null.  Otherwise, removes the string that is on the top of
  // the stack and returns it
  @Override
  public String pop() {
    if (isEmpty()) {
      return null;
    } else {
      String returnVal = strings[0];
      shiftLeft();
      size--;
      return returnVal;
    }
  }

  private void shiftLeft() {
    for (int i = 0; i < size-1; i++) {
      strings[i] = strings[i+1];
    }
  }

  // Returns true iff the stack is empty
  @Override
  public boolean isEmpty() {
    return size == 0;
  }

}
