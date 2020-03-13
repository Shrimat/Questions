import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
  public static void main(String[] args) {}

  public static <T> List<T> concatenate(List<List<T>> lists) {
    return lists.stream()
        .reduce(
            Collections.emptyList(),
            (a, b) -> Stream.concat(a.stream(), b.stream()).collect(Collectors.toList()));
  }

  public static <S, T> List<ImmutablePair<Optional<S>, Optional<T>>> zip(
      List<S> first, List<T> second) {
    return
  }
}
