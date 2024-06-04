package ForLoop;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxValue = Integer.MIN_VALUE; //най-голямата стойност я сравняваме с най-малката възможна стойност, всичко друго ще е
        // преди -2147483648
        int minValue = Integer.MAX_VALUE; //най-малката стойност я сравняваме с най-голямата възможна стойност, всичко друго ще е
        // преди 2147483647
        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxValue){
                maxValue = number; //maxValue придобива нова стойност и това е най-голямото число
            }
            if (number < minValue){
                minValue = number; //minValue придобива нова стойност и това е най-малкото число
            }
        }
        System.out.printf("Max number: %d%n", maxValue);
        System.out.printf("Min number: %d", minValue);

    }
}
