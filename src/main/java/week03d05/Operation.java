package week03d05;

public class Operation {

  private static final String SEPARATE = "+";

  private int leftOperand;
  private int rightOperand;

  public int getResult(String adding) {
    leftOperand = Integer.parseInt(adding.split(SEPARATE)[0]);
    rightOperand = Integer.parseInt(adding.split(SEPARATE)[1]);
    return leftOperand + rightOperand;
  }
}
