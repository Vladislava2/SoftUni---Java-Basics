package conditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double sum = 0.00;

        switch(season){
            case ("Spring"):
                sum = 3000;
                if (fisherman <= 6){
                    sum = 3000 - 3000*0.10;
                } else if (fisherman >= 7 && fisherman <= 11){
                    sum = 3000 - 3000*0.15;
                } else {
                    sum = 3000 - 3000*0.25;
                }
                break;
            case("Summer"):
            case("Autumn"):
                sum = 4200;
                if (fisherman <= 6){
                    sum = 4200 - 4200*0.10;
                } else if (fisherman >= 7 && fisherman <= 11){
                    sum = 4200 - 4200*0.15;
                } else {
                    sum = 4200 - 4200*0.25;
                }
                break;
            case("Winter"):
                sum = 2600;
                if (fisherman <= 6){
                    sum = 2600 - 2600*0.10;
                } else if (fisherman >= 7 && fisherman <= 11){
                    sum = 2600 - 2600*0.15;
                } else {
                    sum = 2600 - 2600*0.25;
                }
                break;
        }
        if (fisherman % 2 == 0 && !(season.equals("Autumn"))){
            sum = sum - (0.05*sum);
        }

        if (budget >= sum){
            System.out.printf("Yes! You have %.2f leva left.", budget - sum);
        } else if (budget < sum){
            System.out.printf("Not enough money! You need %.2f leva.", sum - budget);
        }
    }
}
