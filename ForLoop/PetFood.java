package ForLoop;

import java.util.Scanner;

public class PetFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double totalEatenBiscuits = 0.00;
        double eatenFood = 0.00;
        double eatenFoodDog = 0.00;
        double eatenFoodCat = 0.00;
        double eatenFoodPerDay = 0.00;


        for(int i = 1; i <= days; i++){
            int dogsFood = Integer.parseInt(scanner.nextLine());
            double catsFood = Double.parseDouble(scanner.nextLine());

            eatenFoodDog = eatenFoodDog + dogsFood;
            eatenFoodCat = eatenFoodCat + catsFood;
            eatenFoodPerDay = dogsFood + catsFood;
            eatenFood = eatenFoodCat + eatenFoodDog;

            if (i % 3 == 0){
                totalEatenBiscuits = totalEatenBiscuits + (0.10 * eatenFoodPerDay);
            }
        }
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(totalEatenBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", (eatenFood / food * 100));
        System.out.printf("%.2f%% eaten from the dog.%n", (eatenFoodDog / eatenFood * 100));
        System.out.printf("%.2f%% eaten from the cat.%n", (eatenFoodCat / eatenFood * 100));
    }
}
