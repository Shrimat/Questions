import java.util.HashSet;
import java.util.Set;

public class Demo {
  public static void main(String[] args) {
    Set<B> setOfB = new HashSet<>();
    // Set<A> setOfA = setOfB; //This line produces a compilation error because the left hand side
    // is too generic which means an object of type A can be added to the set of Bs type error
    Set<? extends A> setOfA = setOfB; // This works because once we have ? on the left any subclass of A can be assigned
    // to ?, specifically B in this case, so all operations of class B can be applied to the
    // elements in the set
  }
}
