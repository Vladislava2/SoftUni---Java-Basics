package conditionalStatementsAdvanced;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean validData = true;
        if (number >= 100 && number <=200 || number == 0){
            validData = true;
        } else {
            validData = false;
            System.out.println("invalid");
        }
    }
}
