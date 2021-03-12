package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

  public List<Integer> getIndexesOfChar(String str, char character) {
    List<Integer> characters = new ArrayList<>();
    int i = 0;
    for (char c:str.toCharArray()) {
      if (c == character) {
        characters.add(i);
      }
      i++;
    }
    return characters;
  }

}
