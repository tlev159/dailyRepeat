package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {

  @Test
  void selectOddsFromList() {

    ListSelector listSelector = new ListSelector();

    List<String> sample = new ArrayList<>(Arrays.asList(
       "alma", "körte", "szilva", "citrom", "banán", "eper"
    ));

    assertEquals("[alma, szilva, banán]", listSelector.selectOddsFromList(sample));
  }
}