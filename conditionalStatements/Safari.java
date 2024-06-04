package conditionalStatements;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double priceForFuel = fuel * 2.10;
        double priceWithTourGuide = priceForFuel + 100;
        double PriceWithDiscount = 0;

        switch(dayOfWeek){
            case ("Saturday"):
                PriceWithDiscount = priceWithTourGuide - (priceWithTourGuide * 0.10);
                break;
            case ("Sunday"):
                PriceWithDiscount = priceWithTourGuide - (priceWithTourGuide * 0.20);
                break;
        }

        if (budget > PriceWithDiscount){
            System.out.printf("Safari time! Money left: %.2f lv.", budget - PriceWithDiscount);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", PriceWithDiscount - budget);
        }
    }
}
