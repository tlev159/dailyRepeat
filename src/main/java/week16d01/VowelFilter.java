package week16d01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VowelFilter {

//  private static final String VOWELS = {'a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'ö', 'ő', 'u', 'ú', 'ü', 'ű'};
  private static final String VOWELS = "aAáÁeEéÉiIíÍoOóÓöÖőŐuUúÚüÜűŰ";

  public String filterVowels(BufferedReader reader) throws IOException {
    String line;
    StringBuilder sb = new StringBuilder();
    while ((line = reader.readLine()) != null) {
      changeVowelToEmptyChar(line, sb);
    }
    return sb.toString();
  }

  private void changeVowelToEmptyChar(String line, StringBuilder sb) {
    for (char w: line.toCharArray()) {
      boolean isAVowel = isAVowel(w);
      if (!isAVowel) {
        sb.append(w);
      }
    }
    sb.append("\n");
  }

  private boolean isAVowel(char w) {
    boolean isAVowel = false;
    for (char c:VOWELS.toCharArray()) {
      if (w == c) {
        isAVowel = true;
      }
    }
    return isAVowel;
  }

}
