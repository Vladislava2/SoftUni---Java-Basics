package conditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double sum = 0.00;
        String place = "";
        String destination = "";

        switch (season){
            case ("summer"):
                if (budget <= 100){
                    place = "Camp";
                    destination = "Bulgaria";
                    sum = 0.30*budget;
                } else if (budget <= 1000){
                    place = "Camp";
                    destination = "Balkans";
                    sum = 0.40*budget;
                } else {
                    place = "Hotel";
                    destination = "Europe";
                    sum = 0.90*budget;
                }
                break;
            case("winter"):
                if (budget <= 100){
                    place = "Hotel";
                    destination = "Bulgaria";
                    sum = 0.70*budget;
                } else if (budget <= 1000){
                    place = "Hotel";
                    destination = "Balkans";
                    sum = 0.80*budget;
                } else {
                    place = "Hotel";
                    destination = "Europe";
                    sum = 0.90*budget;
                }
                break;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, sum);
    }
}
