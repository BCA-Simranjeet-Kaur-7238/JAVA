//Implement a command-line calculator that takes arithmetic expressions as command-line arguments and evaluates them. Support basic arithmetic operations like addition, subtraction, multiplication, and division.

public class Practical2a {

    public static double calculate(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                }
                return num1 / num2;
            default:
                System.out.println("Invalid operator. Supported operators: +, -, *, /");
                return 0;
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid number of arguments. <num1> <operator> <num2>");
        }
        double num1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double num2 = Double.parseDouble(args[2]);

        double result = calculate(num1, operator, num2);
        System.out.println("Result: " + result);
    }
}
