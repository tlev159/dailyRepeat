package week05d02;

public class ChangeLetter {

  private static final String VOLWES = "aAeEiIoOuU";
  private static final char PLACEHOLDER = '*';

  public String changeVowels(String str) {
    for (int i = 0; i < VOLWES.length(); i++) {
      str = str.replace(VOLWES.charAt(i), PLACEHOLDER);
    }
    return str;
  }
}
