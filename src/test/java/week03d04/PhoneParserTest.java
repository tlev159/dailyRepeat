package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneParserTest {

  @Test
  public void parse() {
    PhoneParser phoneParser = new PhoneParser();

    Phone phone = phoneParser.parse("12-3456789");

    assertEquals("12", phone.getPrefix());
    assertEquals("3456789", phone.getNumber());
  }
}