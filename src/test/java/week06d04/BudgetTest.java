package week06d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {

  @Test
  public void testConstructorWhenParamNull() {

    Exception ex = assertThrows(IllegalArgumentException.class, () -> new Budget(null));
    assertEquals("List of items can not be null or empty!", ex.getMessage());
  }

  @Test
  public void testConstructorWhenParamEmpty() {

    Exception ex = assertThrows(IllegalArgumentException.class, () -> new Budget(List.of()));
    assertEquals("List of items can not be null or empty!", ex.getMessage());
  }

  @Test
  void testGetItemsByMonth() {
    List<Item> items = new ArrayList<>();
    Item item1 = new Item(1233, 1, "alma1");
    Item item2 = new Item(1234, 2, "alma2");
    Item item3 = new Item(1235, 2, "alma3");
    Item item4 = new Item(1236, 3, "alma4");
    Item item5 = new Item(1237, 3, "alma5");
    Item item6 = new Item(1238, 3, "alma6");
    Item item7 = new Item(1239, 5, "alma7");
    Item item8 = new Item(1230, 7, "alma8");

    items.add(item1);
    items.add(item2);
    items.add(item3);
    items.add(item4);
    items.add(item5);
    items.add(item6);
    items.add(item7);
    items.add(item8);

    List<Item> result1 = new ArrayList<>();
    result1.add(item1);

    List<Item> result2 = new ArrayList<>();
    result2.add(item4);
    result2.add(item5);
    result2.add(item6);

    Budget budget = new Budget(items);

    assertEquals(result1, budget.getItemsByMonth(1));
    assertEquals(result2, budget.getItemsByMonth(3));
    assertEquals(List.of(), budget.getItemsByMonth(12));

  }
}