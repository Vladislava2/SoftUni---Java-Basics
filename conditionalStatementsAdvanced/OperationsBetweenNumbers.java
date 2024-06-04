package conditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.00;

        if (b == 0 && (operator.equals("/") || operator.equals("%"))){
            System.out.printf("Cannot divide %d by zero", a);
            return;
        }

        switch (operator){
            case("+"):
                result = a + b;
                break;
            case("-"):
                result = a - b;
                break;
            case("*"):
                result = a * b;
                break;
            case("/"):
                result = ((a*1.0) / (b*1.0));
                break;
            case("%"):
                result = a % b;
                break;
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")){
            if (result % 2 == 0){
                System.out.printf("%d %s %d = %.0f - even", a, operator, b, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", a, operator, b, result);
            }
        } else if (operator.equals("/")){
            System.out.printf("%d / %d = %.2f", a, b, result);
        } else if (operator.equals("%")){
            System.out.printf("%d %% %d = %.0f", a, b, result);
        }
    }
}
