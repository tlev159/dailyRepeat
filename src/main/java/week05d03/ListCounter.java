package week05d03;

import java.util.List;

public class ListCounter {

  private static final String START_LETTER = "a";

  public int countStringsStartsWithA(List<String> words) {
    if (words == null || words.size() == 0) {
      return 0;
    }
    int result = 0;
    for (String str:words) {
      if (str.toLowerCase().startsWith(START_LETTER)) {
        result++;
      }
    }
    return result;
  }
}
