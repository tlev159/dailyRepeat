package week02d02;

public class Phone {

  private String name;
  private int mem;

  public Phone(String name, int mem) {
    this.name = name;
    this.mem = mem;
  }

  public static void main(String[] args) {
    Phone phone = new Phone("Jane Doe", 12345678);
    System.out.println("Name: " + phone.getName());
    System.out.println("mem: " + phone.getMem());
  }

  public String getName() {
    return name;
  }

  public int getMem() {
    return mem;
  }
}
