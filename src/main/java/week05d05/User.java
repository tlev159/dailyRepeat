package week05d05;

public class User {

  private static final String AT = "@";
  private static final String DOT = ".";

  private String firstName;
  private String lastName;
  private String email;

  public User(String firstName, String lastName, String email) {
    if (!email.contains(AT) || !email.contains(DOT)) {
      throw new IllegalArgumentException("Email is not correct!");
    }
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }
}
