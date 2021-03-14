package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

  private List<Item> items;

  public Budget(List<Item> items) {
    if (items == null || items.size() == 0) {
      throw new IllegalArgumentException("List of items can not be null or empty!");
    }
    this.items = items;
  }

  public List<Item> getItemsByMonth(int month) {
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Month can only between 1 and 12!");
    }
    List<Item> result = new ArrayList<>();
    for (Item item:items) {
      if (item.getMonth() == month) {
        result.add(item);
      }
    }
    return result;
  }
}
