import java.util.Scanner;

public class Fibonacci {

    // Iterative method for efficiency
    public static long fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a non-negative integer (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program.");
                break;
            }

            try {
                int n = Integer.parseInt(input);

                if (n < 0) {
                    System.out.println("Error: Please enter a non-negative integer.");
                } else {
                    long result = fibonacciIterative(n);
                    System.out.println("Fibonacci(" + n + ") = " + result);
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();
    }
}