package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

  private final int guessedNumber;

  public GuessTheNumber() {
    Random rnd = new Random();
    this.guessedNumber = rnd.nextInt(100) + 1;
  }

  public void guessTheNumber() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Kérem, íra be, hogy milyen számra gondolhattam! (maximum 6-szor próbálkozhat)!");
    int round = 1;
    System.out.println(round + ". próbálkozás: ");
    int temp = Integer.parseInt(scanner.nextLine());
    temp = makeRoundsOfGuesses(scanner, round, temp);
    if (temp == guessedNumber) {
      System.out.println("Sikerült! Kitaláltad az általam gondolt számot: " + guessedNumber);
    } else {
      System.out.println("Sajnos nem találtad ki a gondolt számot! A gondolt szám a(z) " + guessedNumber + " volt!");
    }
  }

  private int makeRoundsOfGuesses(Scanner scanner, int round, int temp) {
    while (round < 6 & temp != guessedNumber) {
      round++;
      if (guessedNumber < temp) {
        System.out.println("A gondolt szám ennél kisebb! Kérem próbálkozzon újra!");
        System.out.println(round + ". próbálkozás: ");
      } else {
        System.out.println("A gondolt szám ennél nagyobb! Kérem próbálkozzon újra!");
        System.out.println(round + ". próbálkozás:");
      }
      temp = Integer.parseInt(scanner.nextLine());
    }
    return temp;
  }

  public static void main(String[] args) {
    GuessTheNumber gn = new GuessTheNumber();
    gn.guessTheNumber();
  }
}
