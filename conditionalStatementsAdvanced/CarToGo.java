package conditionalStatementsAdvanced;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double carExpenses = 0.00;
        String car = "";

        switch (season){
            case ("Summer"):
                if (budget <= 100){
                    System.out.println("Economy class");
                    car = "Cabrio";
                    carExpenses = 0.35 * budget;
                    System.out.printf("%s - %.2f", car, carExpenses);
                } else if (budget > 100 && budget <= 500){
                    System.out.println("Compact class");
                    car = "Cabrio";
                    carExpenses = 0.45 * budget;
                    System.out.printf("%s - %.2f", car, carExpenses);
                } else if (budget > 500){
                    System.out.println("Luxury class");
                    car = "Jeep";
                    carExpenses = 0.90 * budget;
                    System.out.printf("%s - %.2f", car, carExpenses);
                }
                break;
            case ("Winter"):
                if (budget <= 100){
                    System.out.println("Economy class");
                    car = "Jeep";
                    carExpenses = 0.65 * budget;
                    System.out.printf("%s - %.2f", car, carExpenses);
                } else if (budget > 100 && budget <= 500){
                    System.out.println("Compact class");
                    car = "Jeep";
                    carExpenses = 0.80 * budget;
                    System.out.printf("%s - %.2f", car, carExpenses);
                } else if (budget > 500){
                    System.out.println("Luxury class");
                    car = "Jeep";
                    carExpenses = 0.90 * budget;
                    System.out.printf("%s - %.2f", car, carExpenses);
                }
                break;
        }
    }
}
