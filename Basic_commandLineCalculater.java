import java.util.Scanner;

public class Basic_commandLineCalculater {
    public static void displayMenu() {
        System.out.println("Please select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static double[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        return new double[] { num1, num2 };
    }

    public static void displayResult(double result) {
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    double[] numbersForAddition = getNumbers();
                    double additionResult = add(numbersForAddition[0], numbersForAddition[1]);
                    displayResult(additionResult);
                    break;
                case 2:
                    double[] numbersForSubtraction = getNumbers();
                    double subtractionResult = subtract(numbersForSubtraction[0], numbersForSubtraction[1]);
                    displayResult(subtractionResult);
                    break;
                case 3:
                    double[] numbersForMultiplication = getNumbers();
                    double multiplicationResult = multiply(numbersForMultiplication[0], numbersForMultiplication[1]);
                    displayResult(multiplicationResult);
                    break;
                case 4:
                    double[] numbersForDivision = getNumbers();
                    try {
                        double divisionResult = divide(numbersForDivision[0], numbersForDivision[1]);
                        displayResult(divisionResult);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

}
