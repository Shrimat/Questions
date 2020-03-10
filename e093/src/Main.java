import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    int n = 0;
    while (flag) {
      n = scanner.nextInt();
      if (n <= 0) {
        System.err.println("Please enter a positive integer.");
      } else {
        flag = false;
      }
    }
    int counter = 0;
    int summation = 0;
    while (counter < n) {
      try {
        summation += Integer.parseInt(scanner.next());
      } catch (NumberFormatException e) {
        System.err.println("Your input has been ignored. Re-enter please.");
        continue;
      }
      counter ++;
    }
    System.out.println((double) summation/n);
  }
}
