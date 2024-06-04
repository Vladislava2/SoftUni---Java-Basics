package conditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double sum = 0.00;

        switch (flowerType){
            case("Roses"):
                sum = flowers * 5;
                if (flowers > 80) {
                    sum = (flowers * 5) - ((flowers * 5) * 0.10);
                }
                break;
            case("Dahlias"):
                sum = flowers * 3.80;
                if (flowers > 90) {
                    sum = (flowers * 3.80) - ((flowers * 3.80) * 0.15);
                }
                break;
            case("Tulips"):
                sum = flowers * 2.80;
                if (flowers > 80){
                    sum = (flowers * 2.80) - ((flowers * 2.80)*0.15);
                }
                break;
            case("Narcissus"):
                sum = flowers * 3.00;
                if (flowers < 120){
                    sum = (flowers * 3.00) + ((flowers * 3.00)*0.15);
                }
                break;
            case("Gladiolus"):
                sum = flowers * 2.50;
                if (flowers < 80){
                    sum = (flowers * 2.50) + ((flowers * 2.50)*0.20);
                }
                break;
        }
        if (budget > sum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowers, flowerType, budget - sum);
        } else if (budget < sum){
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }
    }
}
