public class SurnameComparator implements PersonComparator {
  @Override
  public int compareTo(Person person1, Person person2) {
    return person1.getSurName().compareTo(person2.getSurName());
  }
}
