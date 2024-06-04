package conditionalStatements;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapes = x * y;
        double wine = 0.40*grapes/2.5;
        double leftoverWine = wine - z;
        double winePerWorker = leftoverWine/workers;

        if (wine >= z){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(leftoverWine), Math.ceil(winePerWorker));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(z-wine));
        }
    }
}
