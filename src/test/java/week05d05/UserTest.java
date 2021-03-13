package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

  @Test
  void getFullName() {

    User user = new User("Jane", "Doe", "email@doe.com");

    assertEquals("Jane Doe", user.getFullName());
  }
}