package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEraserTest {

  @Test
  void testEraseWord() {

    WordEraser wordEraser = new WordEraser();

    String temp = "alma körte szilva alma banán alma eper";
    String result = "körte szilva banán eper";

    assertEquals(result, wordEraser.eraseWord(temp, "alma"));

  }
}