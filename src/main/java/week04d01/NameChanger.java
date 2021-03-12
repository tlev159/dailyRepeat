package week04d01;

public class NameChanger {

  private String fullName;


  public NameChanger(String fullName) {
    if (fullName.isEmpty() || fullName.indexOf(" ") < 0) {
      throw new IllegalArgumentException("Invalid name: " + fullName);
    }
    this.fullName = fullName;
  }

  public String changeFirstName(String firstName) {
    fullName = firstName + fullName.substring(fullName.indexOf(" "));
    return fullName;
  }

  public String getFullName() {
    return fullName;
  }
}
