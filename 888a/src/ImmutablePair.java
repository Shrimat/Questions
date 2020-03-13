public class ImmutablePair<S, T> {

  private S first;
  private T second;

  @Override
  public String toString() {
    return "(" + first + ", " + second + ")";
  }
}
