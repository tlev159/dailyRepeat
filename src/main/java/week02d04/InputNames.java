package week02d04;

import java.util.Scanner;

public class InputNames {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] names = new String[5];
    System.out.println("Kérem adjon meg 5 nevet!");
    for (int i = 0; i < 5; i++) {
      System.out.print((i+1) + ".: ");
      names[i] = scanner.nextLine();
    }
    printNamesIntoSeparateLines(names);
  }

  private static void printNamesIntoSeparateLines(String[] names) {
    int j = 1;
    for (String s: names) {
      System.out.println(j + ".: " + s);
      j++;
    }
  }
}
