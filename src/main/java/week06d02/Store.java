package week06d02;

import java.util.List;

public class Store {

  private List<Product> products;

  public Store(List<Product> products) {
    this.products = products;
  }

  public int getProductByCategoryName(Category category) {
    int result = 0;
    for (Product product:products) {
      if (product.getCategory() == category.toString()) {
        result++;
      }
    }
    return result;
  }
}
