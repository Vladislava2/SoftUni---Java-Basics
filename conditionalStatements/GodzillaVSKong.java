package conditionalStatements;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        double decor = 0.10*budget;
        if (extras >= 150){
            outfitPrice = outfitPrice - (outfitPrice*0.10);
        }
        double consumables = decor + (outfitPrice * extras);
        if (consumables > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", consumables-budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget-consumables);
        }
    }
}
