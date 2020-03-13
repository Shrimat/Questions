public abstract class AbstractNode<E> implements Node<E> {
  protected E key;

  public AbstractNode(E key) {
    this.key = key;
  }

  @Override
  public abstract int getNumberOfChildren();

  @Override
  public abstract Node<E> getChild(int position);

  @Override
  public E getKey() {
    return key;
  }

  @Override
  public void setKey(E key) {
    this.key = key;
  }

  public String toString() {
   if (getNumberOfChildren() == 0) {
     return key.toString();
   } else if (getNumberOfChildren() == 2) {
     return key.toString() + " (" + getChild(0).toString() + ", " + getChild(1).toString() + ")";
   } else {
     StringBuilder myString = new StringBuilder();
     myString.append(key.toString());
     myString.append(" (");
     for (int i = 0; i < getNumberOfChildren(); i++) {
       myString.append(getChild(i).toString());
     }
     myString.append(")");
     return myString.toString();
   }
  }

}
