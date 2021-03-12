package week03d04;

import java.util.Scanner;

public class PhoneParser {

  public Phone parse(String phoneNumber) {

    String[] phone = phoneNumber.split("-");
    return new Phone(phone[0], phone[1]);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    PhoneParser phoneParser = new PhoneParser();
    System.out.println("Kérem a számot '12-1234567' formátumban!");
    Phone phone = phoneParser.parse(scanner.nextLine());
    System.out.println(phone.toString());
  }
}
