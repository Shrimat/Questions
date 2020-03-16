import java.util.HashSet;
import java.util.Set;

public class MemoryEfficientIntSet implements IntSet {
  private Set<Integer> integerSet;

  public MemoryEfficientIntSet() {
    this.integerSet = new HashSet<>();
  }

  @Override
  public void add(int x) {
    integerSet.add(x);
  }

  @Override
  public boolean remove(int x) {
    return integerSet.remove(x);
  }

  @Override
  public boolean isEmpty() {
    return integerSet.isEmpty();
  }

  @Override
  public boolean contains(int x) {
    return integerSet.contains(x);
  }
}
