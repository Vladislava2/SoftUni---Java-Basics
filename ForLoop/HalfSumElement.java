package ForLoop;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber;

            if (currentNumber > maxValue){
                maxValue = currentNumber;
            }
        }
        int sumOfOthers = sum - maxValue;
        if (maxValue == sumOfOthers){
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxValue);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxValue - sumOfOthers));
        }

    }
}
