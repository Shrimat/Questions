import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
  public static void main(String[] args) {
    List<Number> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(2.3);
    numbers.add(-1.1);

    System.out.println("Positive integers from " + numbers + " are: "
            + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));
  }

  public static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
    return numbers
            .filter(x -> x instanceof Integer)
            .filter(x -> ((Integer) x) > 0)
            .map(x -> (Integer) x);
  }
}
