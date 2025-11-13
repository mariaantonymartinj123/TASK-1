import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        while (true) {
            System.out.print("Enter first number (or type 'exit' to quit): ");
            String input1 = z.nextLine();
            if (input1.equalsIgnoreCase("exit")) {
                break;
            }
            double x = Double.parseDouble(input1);

            System.out.print("Enter second number: ");
            double y = Double.parseDouble(z.nextLine());

            System.out.print("Enter operation (+, -, *, /): ");
            String o= z.nextLine();

            double result;
            switch (o) {
                case "+":
                    result = x+y;
                    break;
                case "-":
                    result = x-y;
                    break;
                case "*":
                    result = x*y;
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    result = x/y;
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }
            System.out.println("Result: " + result);
        }
        z.close();
        System.out.println("Calculator exited.");
    }
}
