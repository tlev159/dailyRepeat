package week06d01;

import java.util.List;

public class ListSelector {

  public String selectOddsFromList(List<String> words) {
    if (words == null) {
      throw new IllegalArgumentException("List can not be null!");
    } else if (words.size() == 0) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i< words.size(); i+=2) {
      sb.append(words.get(i) + ", ");
    }
    int toReplaced = sb.length();
    sb.replace(toReplaced - 2, toReplaced, "]");
    return sb.toString();
  }
}
