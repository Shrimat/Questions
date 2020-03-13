public class LeafTreeNode<E> extends AbstractNode<E> {

  public LeafTreeNode(E key) {
    super(key);
  }

  @Override
  public int getNumberOfChildren() {
    return 0;
  }

  @Override
  public Node<E> getChild(int position) {
    return null;
  }

}
