import java.util.*;

class ExpressionParser {
  public static final String SUPPORTED_OPERATORS = "+-*/";

  private static boolean isOperatorSupported(String op) {
    return SUPPORTED_OPERATORS.indexOf(op) > -1;
  }

// Infix    Prefix    Postix
// a + b  	+ a b   	a b +
  public static float calculatePostix(String expr) {
    float result = -1.0f;
    Stack<Float> elements = new Stack();
    Stack<String> operators = new Stack();

    String[] elementsList = expr.split(" ");

    if(elementsList != null)
    for(int i =0; i <= elementsList.length-1; i++) {
      if (isOperatorSupported(elementsList[i])) {
        Float b = elements.pop();
        Float a = elements.pop();

        if (a != null && b != null) {
            switch (elementsList[i]) {
              case "+":
                result = a + b;
                break;
              case "-":
                result = a - b;
                break;
              case "*":
                result = a * b;
                break;
              case "/":
                result = a / b;
                break;
              default:
                result = -1;
                break;
            }
            elements.push(result);
        }
      } else {
        elements.push(new Float(elementsList[i]));
      }
    }

    return result;
  }

  public static void main(String[] args) {
    float r = calculatePostix("1 2 +");
    assert r == 3 : "Expected 3";
    System.out.println(r);
    System.out.println(calculatePostix("2 1 -"));
    System.out.println(calculatePostix("2 2 *"));
    System.out.println(calculatePostix("5 2 /"));
    System.out.println(calculatePostix("5 2 / 2 * 1 +"));
    System.out.println(calculatePostix("5 2 * 2 1 + +"));
  }
}
