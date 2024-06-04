package NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = number1; currentNumber < number2; currentNumber++) {
            String textNumber = currentNumber + "";
            int evenPositionSum = 0;
            int oddPositionSum = 0;

            for (int position = 0; position < textNumber.length(); position++) {
                int digit = Integer.parseInt(textNumber.charAt(position) + "");

                if (position % 2 == 0){
                    evenPositionSum += digit;
                } else {
                    oddPositionSum += digit;
                }
            }
            if (evenPositionSum == oddPositionSum){
                System.out.print(currentNumber + " ");
            }
            
        }
    }
}
