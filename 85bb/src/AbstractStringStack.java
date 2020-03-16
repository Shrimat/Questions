public abstract class AbstractStringStack implements StringStack {

  public abstract void push(String s);

  public abstract String pop();

  public abstract boolean isEmpty();

  public abstract StringStackIterator iterator();

  public String toString() {
    StringBuilder sb = new StringBuilder();
    StringStackIterator myIterator = iterator();
    while (myIterator.hasNext()) {
      sb.append(myIterator.next());
      sb.append(", ");
    }
    return sb.toString();
  }
}
