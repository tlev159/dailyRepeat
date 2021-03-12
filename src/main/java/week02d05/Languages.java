package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {

  public static void main(String[] args) {
    List<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");

    for (String str : languages) {
      if (str.length() > 5) {
        System.out.println(str);
      }
    }
  }
}
