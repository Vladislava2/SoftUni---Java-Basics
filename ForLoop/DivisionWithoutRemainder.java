package ForLoop;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        double percentCountP1 = 0;
        double percentCountP2 = 0;
        double percentCountP3 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0){
                countP1++;
                if (number % 4 == 0){
                    countP3++;
                }
            }
            if (number % 3 == 0){
                countP2++;
            }

            percentCountP1 = countP1 * 1.0 / n * 100;
            percentCountP2 = countP2 * 1.0 / n * 100;
            percentCountP3 = countP3 * 1.0 / n * 100;
        }
        System.out.printf("%.2f%%%n", percentCountP1);
        System.out.printf("%.2f%%%n", percentCountP2);
        System.out.printf("%.2f%%%n", percentCountP3);
    }
}
