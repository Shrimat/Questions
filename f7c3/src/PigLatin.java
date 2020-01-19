import java.util.*;
import java.util.stream.Collectors;

public class PigLatin {
  public static String modifier(String word) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    Character fst = Character.toLowerCase(word.charAt(0));
    if (vowels.contains(fst)) {
      return word + "way";
    } else if (Character.isUpperCase(word.charAt(0))){
      return Character.toUpperCase(word.charAt(1)) + word.substring(2) + fst + "ay";
    } else {
      return word.substring(1) + fst + "ay";
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputLine = scanner.nextLine();
    List<String> words = new ArrayList<>(); // A list to store all the words and then modify them
    List<Character> punctuation = new ArrayList<>(); // We need to add the punctuation in the right places
    int previousIndex = 0; //This index is modified so we can extract substrings from the input
    for (int i = 0; i < inputLine.length(); i++) {
      if (!Character.isLetter(inputLine.charAt(i)) && Character.isLetter(inputLine.charAt(previousIndex))) {
        words.add(inputLine.substring(previousIndex, i));
        punctuation.add(inputLine.charAt(i));
        previousIndex = i+1;
      }
    }
    System.out.println(words);
    System.out.println(punctuation);
    for (String word : words.stream().map(PigLatin::modifier).collect(Collectors.toList())) {
      System.out.print(word + " ");
    }
  }
}
