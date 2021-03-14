package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {

  @Test
  void testSelectOddsFromList() {

    ListSelector listSelector = new ListSelector();

    List<String> sample = new ArrayList<>(Arrays.asList(
       "alma", "körte", "szilva", "citrom", "banán", "eper"
    ));

    assertEquals("[alma, szilva, banán]", listSelector.selectOddsFromList(sample));
  }

  @Test
  void testWhenListIsEmpty() {

    ListSelector listSelector = new ListSelector();

    assertEquals("", listSelector.selectOddsFromList(List.of()));
  }

  @Test
  void selectOddsFromList() {


    Exception ex = assertThrows(IllegalArgumentException.class, () -> new ListSelector().selectOddsFromList(null));
    assertEquals("List can not be null!", ex.getMessage());
  }
}