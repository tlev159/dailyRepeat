package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

  @Test
  void testGetProductByCategoryName() {

    List<Product> products = new ArrayList<>();

    products.add(new Product("kenyér", "BAKEDGOODS", 550));
    products.add(new Product("tej", "DAIRY", 250));
    products.add(new Product("zsemle", "BAKEDGOODS", 55));
    products.add(new Product("sültkrumpli", "FROZEN", 1150));
    products.add(new Product("vaj", "DAIRY", 750));
    products.add(new Product("kifli", "BAKEDGOODS", 50));

    Store store = new Store(products);

    assertEquals(3, store.getProductByCategoryName(Category.BAKEDGOODS));
    assertEquals(2, store.getProductByCategoryName(Category.DAIRY));
    assertEquals(1, store.getProductByCategoryName(Category.FROZEN));
    assertEquals(0, store.getProductByCategoryName(Category.OTHER));

  }

}