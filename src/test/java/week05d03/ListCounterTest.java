package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCounterTest {

  @Test
  void testCountStringsStartsWithA() {

    ListCounter listCounter = new ListCounter();

    List<String> temp = new ArrayList<>(Arrays.asList("alma", "körte", "Aladár", "kiskacsa", "Aladdin"));

    assertEquals(3, listCounter.countStringsStartsWithA(temp));
  }

  @Test
  void testCountStringsStartsWithAIfResultNull() {

    ListCounter listCounter = new ListCounter();

    List<String> temp = new ArrayList<>(Arrays.asList("zöldalma", "körte", "Haladár", "kiskacsa", "kaladdin"));

    assertEquals(0, listCounter.countStringsStartsWithA(temp));
  }

  @Test
  void testIfListEmpty() {

    ListCounter listCounter = new ListCounter();

    List<String> temp = null;

    assertEquals(0, listCounter.countStringsStartsWithA(temp));
  }


}