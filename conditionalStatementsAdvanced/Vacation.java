package conditionalStatementsAdvanced;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double vacationExpanses = 0.00;
        String location = "";
        String place = "";

        switch (season){
            case ("Summer"):
                if (budget <= 1000){
                    location = "Alaska";
                    place = "Camp";
                    vacationExpanses = 0.65 * budget;
                } else if (budget > 1000 && budget <= 3000){
                    location = "Alaska";
                    place = "Hut";
                    vacationExpanses = 0.80 * budget;
                } else if (budget > 3000){
                    location = "Alaska";
                    place = "Hotel";
                    vacationExpanses = 0.90 * budget;
                }
                break;
            case ("Winter"):
                if (budget <= 1000){
                    location = "Morocco";
                    place = "Camp";
                    vacationExpanses = 0.45 * budget;
                } else if (budget > 1000 && budget <= 3000){
                    location = "Morocco";
                    place = "Hut";
                    vacationExpanses = 0.60 * budget;
                } else if (budget > 3000){
                    location = "Morocco";
                    place = "Hotel";
                    vacationExpanses = 0.90 * budget;
                }
                break;
        }
        System.out.printf("%s – %s – %.2f", location, place, vacationExpanses);

    }
}
