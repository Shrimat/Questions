import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
  public static void main(String[] args) {
    final List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 9);
    final List<Integer> list2 = Arrays.asList(1, 10, 100, 1000, 10000);
    final List<Integer> list3 = Arrays.asList(6, 7, 8);
    final List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

    final List<Integer> allIntegers = concatenate(listOfLists);
    final int maxList1 = findMax(list1);
    final int minList2 = findMin(list2);
    final int maxEmpty = findMax(Collections.emptyList());
    final int minEmpty = findMin(Collections.emptyList());
    final int maxOrZeroEmpty = findMinOrZero(Collections.emptyList());
    final int minOrZeroEmpty = findMaxOrZero(Collections.emptyList());
    final int minOfMaxes = findMinOfMaxes(listOfLists);
    final int minOfMaxesEmpty = findMinOfMaxes(Collections.emptyList());
    final int minOfMaxesListOfEmptyLists =
        findMinOfMaxes(Arrays.asList(Collections.emptyList(), Collections.emptyList()));
  }

  public static List<Integer> concatenate(List<List<Integer>> lists) {
    return lists.stream()
        .reduce(
            Collections.emptyList(),
            (a, b) -> Stream.concat(a.stream(), b.stream()).collect(Collectors.toList()));
  }

  public static int findMin(List<Integer> numbers) {
    return numbers.stream().reduce(Integer.MAX_VALUE, Math::min);
  }

  public static int findMinOrZero(List<Integer> numbers) {
    return numbers.stream().reduce(Math::min).orElse(0);
  }

  public static int findMax(List<Integer> numbers) {
    return numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
  }

  public static int findMaxOrZero(List<Integer> numbers) {
    return numbers.stream().reduce((a, b) -> a > b ? a : b).orElse(0);
  }

  public static int findMinOfMaxes(List<List<Integer>> listOfLists) {
    return findMin(listOfLists.stream().map(Example::findMax).collect(Collectors.toList()));
  }
}
