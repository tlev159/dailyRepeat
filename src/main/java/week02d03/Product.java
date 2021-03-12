package week02d03;

public class Product {

  private String name;
  private String code;

  public Product(String name, String code) {
    this.name = name;
    this.code = code;
  }

  public boolean areTheyEqual(Product newProduct) {
    if (name.equals(newProduct.getName()) && (Math.abs(code.length() - newProduct.code.length()) <= 1)) {
      return true;
    } else {
      return false;
    }
  }

  public String getName() {
    return name;
  }

  public String getCode() {
    return code;
  }
}
