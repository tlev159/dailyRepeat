package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

  private String name;
  private int bonus;

  public Position(String name, int bonus) {
    this.name = name;
    this.bonus = bonus;
  }

  public static void main(String[] args) {
    List<Position> positions = new ArrayList<>();

    positions.add(new Position("Jane Doe", 200_000));
    positions.add(new Position("Jack Doe", 180_000));
    positions.add(new Position("Joe Doe", 140_000));
    positions.add(new Position("John Doe", 100_000));

    for (Position position : positions) {
      if (position.getBonus() > 150_000) {
        System.out.println(position);
      }
    }
  }

  public String getName() {
    return name;
  }

  public int getBonus() {
    return bonus;
  }

  @Override
  public String toString() {
    return name + ": bonus= " + bonus;
  }
}
