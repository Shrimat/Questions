import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class Example {
  public static void main(String[] args){
    List<String> strings = new ArrayList<>();
    strings.add("1hello");
    strings.add("2world");
    System.out.println(sqrtsOfFirstDigitsMonolithic(strings));
  }

  public static List<String> reverseEachString(List<String> input) {
    return input.stream()
            .map(StringBuilder::new)
            .map(StringBuilder::reverse)
            .map(StringBuilder::toString)
            .collect(Collectors.toList());
  }

  public static List<String> reverseEachStringMonolithic(List<String> input) {
    return input.stream().map(st -> new StringBuilder().append(st).reverse().toString()).collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigits(List<String> input) {
    return input.stream()
            .filter(st -> Character.isDigit(st.charAt(0)))
            .map(st -> Double.parseDouble(st.substring(0,1)))
            .map(Math::sqrt)
            .collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
    return input.stream()
        .filter(st -> Character.isDigit(st.charAt(0)))
        .map(st -> Math.sqrt(Double.parseDouble(st.substring(0, 1))))
        .collect(Collectors.toList());
    }
}
