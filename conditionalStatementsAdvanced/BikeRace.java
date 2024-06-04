package conditionalStatementsAdvanced;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String route = scanner.nextLine();

        double feeForJuniors = 0.00;
        double feeForSeniors = 0.00;
        double totalSum = 0.00;
        double expenses = 0.00;

        switch (route){
            case("trail"):
                feeForJuniors = 5.50 * juniors;
                feeForSeniors = 7.00 * seniors;
                totalSum = feeForSeniors + feeForJuniors;
                expenses = 0.05 * totalSum;
                break;
            case("cross-country"):
                feeForJuniors = 8.00 * juniors;
                feeForSeniors = 9.50 * seniors;
                totalSum = feeForSeniors + feeForJuniors;
                expenses = 0.05 * totalSum;
                if (juniors+seniors >= 50){
                    totalSum = totalSum - (0.25*totalSum);
                } else {
                    totalSum = feeForSeniors + feeForJuniors;
                }
                expenses = 0.05 * totalSum;
                break;
            case("downhill"):
                feeForJuniors = 12.25 * juniors;
                feeForSeniors = 13.75 * seniors;
                totalSum = feeForSeniors + feeForJuniors;
                expenses = 0.05 * totalSum;
                break;
            case("road"):
                feeForJuniors = 20 * juniors;
                feeForSeniors = 21.50 * seniors;
                totalSum = feeForSeniors + feeForJuniors;
                expenses = 0.05 * totalSum;
                break;
        }
        System.out.printf("%.2f", totalSum - expenses);
    }
}
