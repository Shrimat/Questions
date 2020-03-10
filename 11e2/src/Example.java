import java.util.*;

public class Example {
  public static void main(String[] args) {
    final Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    final Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2));
    final Set<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    final Set<Integer> s4 = new HashSet<>(Arrays.asList(3, 4));
    final List<Set<Integer>> listOfSetsOfIntegers = Arrays.asList(s1, s2, s3, s4);
    final Optional<Set<Integer>> smallestSet = getSmallestCollection(listOfSetsOfIntegers);
    System.out.println(smallestSet);
  }

  public static <C extends Collection<?>>Optional<C> getSmallestCollection(Collection<C> lst) {
    return lst.stream().reduce((x,y) -> x.size() < y.size() ? x : y);
  }
}
