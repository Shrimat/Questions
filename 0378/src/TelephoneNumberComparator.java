public class TelephoneNumberComparator implements PersonComparator{
  @Override
  public int compareTo(Person person1, Person person2) {
    return Integer.signum(person1.getPhoneNumber().compareTo(person2.getPhoneNumber()));
  }
}
