import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {

    char operator;
    Double num1, num2, result;
    Scanner input = new Scanner(System.in);

    // getting input from the user
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    num1 = input.nextDouble();

    System.out.println("Enter second number");
    num2 = input.nextDouble();

    switch (operator)
    {

      // performs addition between numbers
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
