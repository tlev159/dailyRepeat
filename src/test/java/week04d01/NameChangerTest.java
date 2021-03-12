package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

  @Test
  public void testConstructor() {

    NameChanger nameChanger = new NameChanger("Jane Doe");

    assertEquals("Jane Doe", nameChanger.getFullName());
  }

  @Test
  public void testConstructorThrow() {

    Exception ex = assertThrows(IllegalArgumentException.class,() -> new NameChanger("Jane"));
    assertEquals("Invalid name: Jane", ex.getMessage());
  }

  @Test
  void changeFirstName() {

    NameChanger nameChanger = new NameChanger("John Doe");

    assertEquals("John Doe", nameChanger.getFullName());

    assertEquals("Jane Doe", nameChanger.changeFirstName("Jane"));
  }
}