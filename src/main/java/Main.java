import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    System.out.println("Enter a command:");

    while (sc.hasNextLine()) {
      String operation = sc.nextLine();
      String[] parts = operation.split(" ");
      String result;
      switch(parts[0]) {
        case "add":
          Integer firstOperand = Integer.parseInt(parts[1]);
          Integer secondOperand = Integer.parseInt(parts[2]);
          result = String.valueOf(calc.add(firstOperand, secondOperand));
          break;

        case "subtract":
          firstOperand = Integer.parseInt(parts[1]);
          secondOperand = Integer.parseInt(parts[2]);
          result = String.valueOf(calc.subtract(firstOperand, secondOperand));
          break;

        case "multiply":
          firstOperand = Integer.parseInt(parts[1]);
          secondOperand = Integer.parseInt(parts[2]);
          result = String.valueOf(calc.multiply(firstOperand, secondOperand));
          break;

        case "divide":
          firstOperand = Integer.parseInt(parts[1]);
          secondOperand = Integer.parseInt(parts[2]);
          result = String.valueOf(calc.divide(firstOperand, secondOperand));
          break;

        case "fib":
          int operand = Integer.parseInt(parts[1]);
          result = String.valueOf(calc.fibonacciNumberFinder(operand));
          break;

        case "binary":
          operand = Integer.parseInt(parts[1]);
          result = calc.intToBinaryNumber(operand);
          break;

        default:
          result = "error: bad input";
      }
      System.out.println(result);
    }
  }
}
