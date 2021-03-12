package week03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

  @Test
  public void getResult() {

    Operation operation = new Operation();

    assertEquals(122, operation.getResult("100+22"));
  }
}