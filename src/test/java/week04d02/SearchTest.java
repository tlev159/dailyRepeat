package week04d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

  @Test
  void getIndexesOfChar() {

    Search search = new Search();

    List<Integer> result = new ArrayList<>(List.of(0, 3, 5));
    assertEquals(result, search.getIndexesOfChar("almafa", 'a'));
  }
}