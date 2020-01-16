import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReversedInput {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    Deque<String> myDeque = new ArrayDeque<>();
    while (line != null) {
      myDeque.push(line);
      line = br.readLine(); //this reads the next line after implementation
    }
    while (!myDeque.isEmpty()) {
      System.out.println(myDeque.pop());
    }
  }
}
