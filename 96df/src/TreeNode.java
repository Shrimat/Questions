public class TreeNode<E> extends AbstractNode<E> {

  private Node<E>[] children;

  @SuppressWarnings("unchecked")
  public TreeNode(E key, int numberOfChildren) {
    super(key);
    children = (TreeNode<E>[]) new TreeNode[numberOfChildren];
  }

  public int getNumberOfChildren() {
    return children.length;
  }

  public Node<E> getChild(int childIndex) {
    return children[childIndex];
  }

  public void setChild(int childIndex, Node<E> child) {
    children[childIndex] = child;
  }

}