package conditionalStatementsAdvanced;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidayOrNot = scanner.nextLine();
        double sum1 = 0.00;
        double sum2 = 0.00;
        int flowers = chrysanthemums + roses + tulips;

        switch (holidayOrNot){
            case ("Y"):
                sum1 = ((chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50) + 2) + 0.15*(chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50);
                sum2 = ((chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15) + 2) + 0.15*(chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15);
                if (season.equals("Summer") || season.equals("Spring")){
                    if (season.equals("Spring") && tulips > 7){
                        sum1 = sum1 - (0.05*sum1);
                    }

                    if (flowers > 20){
                        sum1 = sum1 - (0.20*sum1);
                    }
                    System.out.printf("%.2f", sum1);
                } else if (season.equals("Autumn") || season.equals("Winter")){
                    if (season.equals("Winter") && roses >= 10){
                        sum2 = sum2 - (0.10*sum2);
                    }

                    if (flowers > 20){
                        sum2 = sum2 - (0.20*sum2);
                    }
                    System.out.printf("%.2f", sum2);
                }
                break;
            case("N"):
                if (season.equals("Summer") || season.equals("Spring")){
                    sum1 = (chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50) + 2;
                    if (flowers > 20){
                        sum1 = ((chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50) + 2) - (0.20*(chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50));
                    }
                    System.out.printf("%.2f", sum1);
                } else if (season.equals("Autumn") || season.equals("Winter")){
                    sum2 = (chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15) + 2;
                    if (flowers > 20){
                        sum2 = ((chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15) + 2) - (0.20*(chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15));
                    }
                    System.out.printf("%.2f", sum2);
                }
                break;
        }
    }
}
