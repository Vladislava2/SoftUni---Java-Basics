package NestedLoops;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number1; i <= number2 ; i++) {
            String textNumber = i + "";

            for (int j = 0; j < textNumber.length() ; j++) {
                int digit = Integer.parseInt(textNumber.charAt(i) + "");

                if (digit % 2 == 1){
                    System.out.printf(textNumber);
                }
            }
            //грешна
        }
    }
}
