import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    IntSet intSet;
    try {
      intSet = readIntegers(Integer.parseInt(args[0]));
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }
    System.out.println("Set is: " + intSet.getClass());
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Enter an int, to be tested for membership: ");
      int scanned;
      try {
        scanned = scanner.nextInt();
      } catch (NoSuchElementException e) {
        break;
      }
      System.out.println("Set contains " + scanned + ": " + intSet.contains(scanned));
    }
    System.out.println("Goodbye!");

  }

  public static IntSet readIntegers(int n) throws IOException {
    IntSet mySet;
    if (n > 10) {
      mySet = new MemoryEfficientIntSet();
    } else {
      mySet = new SpeedEfficientIntSet();
    }
    Scanner myScanner = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      System.out.println("Please enter an int: ");
      int scanned = myScanner.nextInt();
      mySet.add(scanned);
    }
    return mySet;
  }
}
