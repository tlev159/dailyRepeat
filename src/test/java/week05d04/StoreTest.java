package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

  @Test
  void getProducts() {

    Store store = new Store();

    assertEquals(0, store.getProducts().size());

  }

  @Test
  void addProduct() {

    Store store = new Store();

    store.addProduct(new Product("kenyér", 2021, 12, 30));

    assertEquals("kenyér", store.getProducts().get(0).getName());
  }

  @Test
  void getNumberOfExpired() {
    Store store = new Store();

    store.addProduct(new Product("kenyér", 2021, 3, 30));
    store.addProduct(new Product("kenyér", 2021, 3, 10));
    store.addProduct(new Product("tej", 2021, 2, 27));
    store.addProduct(new Product("vaj", 2021, 4, 30));
    store.addProduct(new Product("vaj", 2021, 4, 1));

    assertEquals(2, store.getNumberOfExpired());
  }
}