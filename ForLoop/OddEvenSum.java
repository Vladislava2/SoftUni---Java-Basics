package ForLoop;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++){ //n e броят числа, които ще се пресмятат
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){ //i отговаря за итерациите, които прави клавиатурата, т.е отговаря за четните и нечетните позиции
                evenSum = evenSum + number;
            } else if (i % 2 == 1){
                oddSum = oddSum + number;
            }

        }

        if (evenSum == oddSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
