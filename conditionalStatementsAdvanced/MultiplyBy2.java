package conditionalStatementsAdvanced;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());


        while (a >= 0){ //Цикли докато не получи отрицателна стойност.
            double aMultiplyBy2 = a * 2; //Нова променлива
            System.out.printf("Result: %.2f%n", aMultiplyBy2); //Принтитане на новата променлива, в която се съдържа умножението
            a = Double.parseDouble(scanner.nextLine()); //Циклично четене от конзолата,
            // т.е след всеки резултат се чете ново число, което се умножава по 2.
        }
        System.out.println("Negative number!"); //Изпълнява се, ако а<0!
    }
}
