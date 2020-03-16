public class StringStackArray extends AbstractStringStack {
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
    if (size >= 0) System.arraycopy(strings, 0, strings, 1, size);
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
    if (size - 1 >= 0) System.arraycopy(strings, 1, strings, 0, size - 1);
  }

  // Returns true iff the stack is empty
  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public StringStackIterator iterator() {
    return new StringStackArrayIterator();
  }

  private class StringStackArrayIterator implements StringStackIterator {

    private int pointer;

    private StringStackArrayIterator() {
      this.pointer = 0;
    }
    @Override
    public boolean hasNext() {
      return pointer < strings.length;
    }

    @Override
    public String next() {
      pointer++;
      return strings[pointer-1];
    }
  }

}
