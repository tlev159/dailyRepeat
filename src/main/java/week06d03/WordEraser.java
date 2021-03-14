package week06d03;

public class WordEraser {

  public String eraseWord(String words, String word) {
    String[] temp = words.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String str:temp) {
      if (!str.equals(word)) {
        sb.append(str + " ");
      }
    }
    String result = sb.toString().substring(0, sb.lastIndexOf(" "));
    return result;
  }
}
