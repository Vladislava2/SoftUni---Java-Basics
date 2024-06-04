package conditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int RAMmemory = Integer.parseInt(scanner.nextLine());

        double priceOfVideoCard = videoCard * 250;
        double priceForProcessors = processors*(0.35*priceOfVideoCard);
        double priceForRAMmemory = RAMmemory*(0.10*priceOfVideoCard);
        double totalPrice = priceForRAMmemory + priceForProcessors + priceOfVideoCard;

        if (videoCard > processors){
            totalPrice = totalPrice - (totalPrice*0.15);
        }

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", budget-totalPrice);
        } else if (totalPrice > budget){
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice-budget);
        }
    }
}
