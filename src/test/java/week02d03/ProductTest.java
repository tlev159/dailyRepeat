package week02d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

  @Test
  void TestAreTheyEqual() {

    Product product1 = new Product("Bread", "123456787");
    Product product2 = new Product("Bread", "12345");
    Product product3 = new Product("Banana", "123456787");
    Product product4 = new Product("Banana", "1234567870");

    assertFalse(product1.areTheyEqual(product2));
    assertFalse(product2.areTheyEqual(product3));
    assertTrue(product1.areTheyEqual(product1));
    assertTrue(product3.areTheyEqual(product4));

  }
}