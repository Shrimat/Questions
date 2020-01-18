public class Person {
  private String foreName;
  private String surName;
  private String phoneNumber;

  public Person(String foreName, String surName, String phoneNumber) {
    this.foreName = foreName;
    this.surName = surName;
    this.phoneNumber = phoneNumber;
  }

  public String getForeName() {
    return foreName;
  }

  public String getSurName() {
    return surName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  @Override // overriding means we write over the default definition of this method
  public String toString() {
    return "Person: "
        + "\nForename = "
        + foreName
        + "\nSurname = "
        + surName
        + "\nTelephone Number = "
        + phoneNumber;
  }
}
