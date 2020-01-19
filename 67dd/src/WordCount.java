import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WordCount {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int lines = 0;
    int words = 0;
    int characters = 0;
    String line = br.readLine();
    while (line != null) {
      lines++;
      boolean inWord = false;
      for (int i = 0; i < line.length(); i++) {
        if (Character.isLetterOrDigit(line.charAt(i))) { // You can do two checks in one!!
          characters++;
          if (!inWord) { //inWord acts like a flag and adds a word every time you make a transition
            words ++;
          }
          inWord = true;
        } else {
          inWord = false;
        }
      }
      line = br.readLine();
    }
    System.out.println("Lines: " + lines + "\nWords: " + words + "\nCharacters: " + characters);
  }
}
