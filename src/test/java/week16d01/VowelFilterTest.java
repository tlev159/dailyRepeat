package week16d01;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class VowelFilterTest {

  @Test
  void filterVowels() {

    String result = null;
    VowelFilter vowelFilter = new VowelFilter();
    try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(Path.of("src/main/resources/volwesfilter.txt")))) {
      result = vowelFilter.filterVowels(reader);
    } catch (IOException ioe) {
      throw new IllegalArgumentException("Can not read file!", ioe);
    }

    assertEquals("prcsk\nKlpcsk\nBnn\nCscsk\nMcsk\nMcsk\n", result);

  }
}