public class BinaryTreeNode<E> extends AbstractNode<E> {

  private Node<E> left;
  private Node<E> right;

  public BinaryTreeNode(E key, Node<E> left, Node<E> right) {
    super(key);
    this.left = left;
    this.right = right;
  }

  @Override
  public int getNumberOfChildren() {
    return 2; //Because it is a binary node
  }

  @Override
  public Node<E> getChild(int position) {
    if (position == 0) {
      return left;
    } else {
      return right;
    }
  }

  public void setLeft(Node<E> left) {
    this.left = left;
  }

  public void setRight(Node<E> right) {
    this.right = right;
  }

}
