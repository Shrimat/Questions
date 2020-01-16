import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class RandomNumbers {
  public static void main(String[] args) {
    Random generator = new Random();
    Set<Integer> numbers = new HashSet<>();
    int bound = Integer.parseInt(args[0]);
    int count = 0;
    System.out.println("Generating random numbers: ");
    while (numbers.size() != bound) {
      int generation = generator.nextInt(bound);
      System.out.print(generation + ", ");
      count++;
      numbers.add(generation);
    }
    System.out.println(
        "\nI had to generate "
            + count
            + " random numbers between 0 and "
            + (bound - 1)
            + " to have produced all such numbers at least once.");
  }
}
