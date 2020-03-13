public interface Node<E> {

  int getNumberOfChildren();

  E getKey();

  void setKey(E key);

  Node<E> getChild(int position);


}
