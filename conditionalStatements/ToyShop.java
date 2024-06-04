package conditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Пъзел - 2.60 лв.
        //Говореща кукла - 3 лв.
        //Плюшено мече - 4.10 лв.
        //Миньон - 8.20 лв.
        //Камионче - 2 лв.

        double priceForTrip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int toys = puzzles + dolls + teddyBears + minions + trucks;
        double priceForToys = (puzzles*2.60) + (dolls*3) + (teddyBears*4.10) + (minions*8.20) + (trucks*2);

        if (toys >= 50){
            priceForToys = priceForToys - (priceForToys*0.25);
        }
        double rent = 0.10*priceForToys;
        double totalProfit = priceForToys - rent;

        if (totalProfit >= priceForTrip) {
            System.out.printf("Yes! %.2f lv left.", totalProfit-priceForTrip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceForTrip-totalProfit);
        }
    }
}
