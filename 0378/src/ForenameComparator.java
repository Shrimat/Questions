public class ForenameComparator implements PersonComparator{
  @Override
  public int compareTo(Person person1, Person person2) {
    return Integer.signum(person1.getForeName().compareTo(person2.getForeName()));
  }
}
