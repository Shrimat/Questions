import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Demo {

  private static Person comparison(Person person1, Person person2, PersonComparator comparator) {
    if (comparator.compareTo(person1, person2) == -1) {
      return person1;
    } else {
      return person2;
    }
  }

  public static Person findMin(Set<Person> people, PersonComparator comparator) {
    return people.stream().reduce((x, y) -> comparison(x, y, comparator)).orElse(null);
  }

  public static void main(String[] args) {
    Person person1 = new Person("Shrimat", "Kapoor", "07448155271");
    Person person2 = new Person("Neeraj", "Kapoor", "07557508261");
    Person person3 = new Person("Reetika", "Kapoor", "07448718915");
    Person person4 = new Person("Sudiksha", "Kapoor", "07407702874");
    Person person5 = new Person("George", "Hutchings", "07784846688");
    Set<Person> people = new HashSet<>(Arrays.asList(person1, person2, person3, person4));
    SurnameComparator surnameComparator = new SurnameComparator();
    ForenameComparator forenameComparator = new ForenameComparator();
    TelephoneNumberComparator telephoneNumberComparator = new TelephoneNumberComparator();
    TwoTieredComparator twoComp = new TwoTieredComparator(surnameComparator, forenameComparator);
    TwoTieredComparator threeComp =
        new TwoTieredComparator(twoComp, telephoneNumberComparator); // Folding the operation
    System.out.println(findMin(people, threeComp));
  }
}
