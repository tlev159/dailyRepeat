package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeLetterTest {

  @Test
  void changeVowels() {

    ChangeLetter changeLetter = new ChangeLetter();

    assertEquals("*lm*nt*m * p**cr* m*kk*t v*nn*", changeLetter.changeVowels("Elmentem a piacra makkot venni"));
  }
}