package week02d02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneTest {

  @Test
  public void testAddNewPhone() {

    Phone p1 = new Phone("Jane Doe", 123546789);
    Phone p2 = new Phone("Jack Doe", 987654321);

    assertEquals(123546789, p1.getMem());
    assertEquals("Jack Doe", p2.getName());
  }

}
